package com.example.taifa.camera;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    Button button;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.Image_view);
        button.setOnClickListener(new View.OnClickListener()    {

            @Override
            public void OnClick(View v){



            }

        });
    }


    Private File getFile() {

        File folder = new File ("sdcard/camera_app");
        if(!folder.exists()){


            folder.mkdir();


        }


        return null;
    }
}
