package com.example.recyclerview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
   ArrayList <ContactModel> contacts = new ArrayList<>();
   FloatingActionButton dialog_button;
   ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

         dialog_button = findViewById(R.id.dialog_button);
         recyclerView = findViewById(R.id.recyclerView);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));

         dialog_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Dialog dialog= new Dialog(MainActivity.this);
                 dialog.setContentView(R.layout.dialogue_box);
                 EditText edname = dialog.findViewById(R.id.edname);
                 EditText ednumber = dialog.findViewById(R.id.ednumber);
                 Button updatebtn = dialog.findViewById(R.id.updatebtn);

                 updatebtn.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Context context = MainActivity.this;
                         String name , number ;
                         if(!edname.getText().toString().isEmpty() && !ednumber.getText().toString().isEmpty()) {
                              name = edname.getText().toString();
                             number = ednumber.getText().toString();
                             contacts.add(new ContactModel(R.drawable.circle,name,number));
                             adapter.notifyItemInserted(contacts.size()-1);
                             recyclerView.scrollToPosition(contacts.size()-1);

                         }
                         else{
                             Toast.makeText(context,"enter name and number ", Toast.LENGTH_SHORT).show();
                         }

                         dialog.dismiss();

                     }
                 });dialog.show();



             }

         });



        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));
        contacts.add(new ContactModel(R.drawable.circle,"Ayush Singh", "8603325498"));
        contacts.add(new ContactModel(R.drawable.circle,"Sushil", "8974562156"));
        contacts.add(new ContactModel(R.drawable.circle," Power Star", "1365897456"));
        contacts.add(new ContactModel(R.drawable.circle,"Aman kumar singh", "7033759086"));

           adapter = new ContactAdapter(contacts,this);
           recyclerView.setAdapter(adapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}