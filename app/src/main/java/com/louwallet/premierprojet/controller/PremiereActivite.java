package com.louwallet.premierprojet.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.louwallet.premierprojet.R;

public class PremiereActivite extends AppCompatActivity {
    private TextView textseul;
    private Button start1;
    private EditText urname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiere_activite);

       textseul = (TextView) findViewById((R.id.activity_premiere_greeting_txt));
       start1 = (Button) findViewById(R.id.boutonstart);
       urname = (EditText) findViewById(R.id.editeurtext1erpage);

       start1.setEnabled(false);
       urname.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               start1.setEnabled(urname.length()>0);
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
start1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent gameActivity = new Intent(PremiereActivite.this, GameActivity.class);
        startActivity(gameActivity);

    }
});
    }
}
