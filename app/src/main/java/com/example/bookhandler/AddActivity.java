package com.example.bookhandler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText title, author, pages;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        title = findViewById(R.id.title_EditText);
        author = findViewById(R.id.author_EditText);
        pages = findViewById(R.id.pages_editText);
        b = findViewById(R.id.add_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(title.getText().toString().trim(),
                        author.getText().toString().trim(),
                        Integer.valueOf(pages.getText().toString().trim()));
            }
        });
    }
}