package com.tapcom.sample;

import android.os.Bundle;

import com.tapcom.modelmapping.ModelMapper;
import com.tapcom.modelmapping.exeptions.DataTypeNotPresentException;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SourceClass sourceClass = new SourceClass("Hello",2);
        try {
            new ModelMapper().Map(sourceClass,new Destination());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (DataTypeNotPresentException e) {
            e.printStackTrace();
        }
    }
}