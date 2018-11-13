package com.project.mandeep.userprofile;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserProfileInfo extends AppCompatActivity {
    TextView editprofile, favourite, interests;
    ImageView acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interests = findViewById(R.id.interests);

        editprofile= findViewById(R.id.EditProfile);

        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(UserProfileInfo.this,EditProfile.class);
                startActivity(intent);
            }
        });

        favourite=findViewById(R.id.fav);

        favourite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(UserProfileInfo.this,Favourites.class);
                startActivity(intent);
            }
        });

        interests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(UserProfileInfo.this,Interests.class);
                startActivity(intent);
            }
        });
        acc= findViewById(R.id.account);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(UserProfileInfo.this,ArdenVideos.class);
                startActivity(intent);
            }


    });
}
}
