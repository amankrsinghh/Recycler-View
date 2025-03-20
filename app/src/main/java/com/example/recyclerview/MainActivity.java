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
    ArrayList<contact_model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        list.add(new contact_model("Aman kumar singh", "7033759086", R.drawable.circle));
        list.add(new contact_model("papa", "7033759086", R.drawable.circle));
        list.add(new contact_model("mami", "7033759086", R.drawable.circle));
        list.add(new contact_model("aman", "7033759086", R.drawable.circle));
        list.add(new contact_model("Rishav", "6959846464", R.drawable.circle));
        list.add(new contact_model("Strawberry", "548796123", R.drawable.circle));
        list.add(new contact_model("Bhad me jaao", "235489703", R.drawable.circle));
        list.add(new contact_model("Aman kumar singh", "7033759086", R.drawable.circle));
        list.add(new contact_model("papa", "7033759086", R.drawable.circle));
        list.add(new contact_model("mami", "7033759086", R.drawable.circle));
        list.add(new contact_model("aman", "7033759086", R.drawable.circle));
        list.add(new contact_model("Rishav", "6959846464", R.drawable.circle));
        list.add(new contact_model("Strawberry", "548796123", R.drawable.circle));
        list.add(new contact_model("Bhad me jaao", "235489703", R.drawable.circle));
        list.add(new contact_model("Aman kumar singh", "7033759086", R.drawable.circle));
        list.add(new contact_model("papa", "7033759086", R.drawable.circle));
        list.add(new contact_model("mami", "7033759086", R.drawable.circle));
        list.add(new contact_model("aman", "7033759086", R.drawable.circle));
        list.add(new contact_model("Rishav", "6959846464", R.drawable.circle));
        list.add(new contact_model("Strawberry", "548796123", R.drawable.circle));
        list.add(new contact_model("Bhad me jaao", "235489703", R.drawable.circle));
        contact_adapter adapter = new contact_adapter(list, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}