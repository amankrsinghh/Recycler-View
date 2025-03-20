package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contact_adapter extends RecyclerView.Adapter<contact_adapter.viewholder> {
    ArrayList<contact_model> list;
    Context context;

    public contact_adapter(ArrayList<contact_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_design, parent, false);
        viewholder vh = new viewholder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        contact_model model = list.get(position);
        holder.ContactName.setText(model.getName());
        holder.Contactnumber.setText(model.getNumber());
        holder.ContactImg.setImageResource(model.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView ContactName, Contactnumber;
        ImageView ContactImg;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            ContactName = itemView.findViewById(R.id.name);
            Contactnumber = itemView.findViewById(R.id.number);
            ContactImg = itemView.findViewById(R.id.image);
        }
    }
}
