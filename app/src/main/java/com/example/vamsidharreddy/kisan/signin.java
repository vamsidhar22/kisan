package com.example.vamsidharreddy.kisan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vamsidharreddy.kisan.Common.Common;
import com.example.vamsidharreddy.kisan.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signin extends AppCompatActivity {
    EditText editText,editpassword;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        editText=(EditText)findViewById(R.id.edtphone);
        editpassword=(EditText)findViewById(R.id.edtpssd);
        signin=(Button)findViewById(R.id.signin);
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference table_user=database.getReference("user");
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog mDialog=new ProgressDialog(signin.this);
                mDialog.setMessage("please wait loading.....");
                mDialog.show();
                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child(editText.getText().toString()).exists()) {
                            mDialog.dismiss();
                            User user = dataSnapshot.child(editText.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(editpassword.getText().toString())) {
                                Toast.makeText(signin.this, "sign in succesfull !!", Toast.LENGTH_SHORT).show();
                                Intent homeIntent=new Intent(com.example.vamsidharreddy.kisan.signin.this,Kisan.class);
                                Common.currentUser=user;
                                startActivity(homeIntent);
                                finish();
                            } else {
                                Toast.makeText(signin.this, "wrong password!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            mDialog.dismiss();
                            Toast.makeText(signin.this, "user doesn't exist in database !!", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
