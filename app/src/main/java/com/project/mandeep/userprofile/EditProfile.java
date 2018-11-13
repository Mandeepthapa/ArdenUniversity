package com.project.mandeep.userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class EditProfile extends AppCompatActivity {
    ImageView back,acc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        //back button
        back=findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EditProfile.this,UserProfileInfo.class);
                startActivity(intent);
            }
        });
        acc=findViewById(R.id.account);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EditProfile.this,ArdenVideos.class);
                startActivity(intent);
            }
        });

    }
}
