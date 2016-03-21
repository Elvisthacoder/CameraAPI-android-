package com.example.taifa.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;


public class MainActivity extends Activity {

    Button button;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.Image_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent camera_intent = new Intent()

            }
        });

    }


    private File getFile() {

        File folder = new File("sdcard/camera_app");
        if (!folder.exists()) {


            folder.mkdir();


        }

        File image_file = new File(folder, "cam_image.jpg");
        return image_file;
    }

}