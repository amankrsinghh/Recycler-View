package com.example.recyclerview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    ArrayList<ContactModel> contacts;
    Context context;
    private ViewHolder holder;
    private int position;

    public ContactAdapter(ArrayList<ContactModel> contacts, Context context){
        this.contacts=contacts;
        this.context = context;
    }



    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_layer,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.img.setImageResource(contacts.get(position).image);
             holder.cname.setText(contacts.get(position).name);
             holder.cnum.setText(contacts.get(position).number);

             holder.lnrlayout.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Dialog dialog = new Dialog(context);
                     dialog.setContentView(R.layout.dialogue_box);
                     EditText edname = dialog.findViewById(R.id.edname);
                     EditText ednumber = dialog.findViewById(R.id.ednumber);
                     Button updatebtn = dialog.findViewById(R.id.updatebtn);

                     updatebtn.setText("UPDATE");
                     edname.setText(contacts.get(position).name);
                     ednumber.setText(contacts.get(position).number);
                     updatebtn.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             String name , number ;
                             if(!edname.getText().toString().isEmpty() && !ednumber.getText().toString().isEmpty()) {
                                 name = edname.getText().toString();
                                 number = ednumber.getText().toString();
                                 contacts.set(position,new ContactModel(R.drawable.circle,name,number));
                                 notifyItemChanged(position);


                             }
                             else{
                                 Toast.makeText(context,"enter name and number ", Toast.LENGTH_SHORT).show();
                             }

                             dialog.dismiss();
                         }
                     });



                     dialog.show();
                 }
             });


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView cname, cnum;
        ImageView img;
        LinearLayout lnrlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            cname = itemView.findViewById(R.id.cname);
            cnum = itemView.findViewById(R.id.cnum);
            lnrlayout= itemView.findViewById(R.id.lnrlayout);

        }
    }
}
