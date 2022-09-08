package com.tapcom.sample;

import android.os.Bundle;
import android.util.Log;

import com.tapcom.modelmapping.ModelMapper;
import com.tapcom.modelmapping.exeptions.DataTypeNotPresentException;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {
            ArrayList<SourceSubClass> sourceClasses= new ArrayList<>();
            sourceClasses.add(new SourceSubClass("Ankit",100));
            sourceClasses.add(new SourceSubClass("Ankit",100));
            sourceClasses.add(new SourceSubClass("Ankit",100));
            sourceClasses.add(new SourceSubClass("Ankit",100));
            SourceClass sourceClass = new SourceClass("Hello",2,sourceClasses);
            Destination destination =   new ModelMapper().Map(sourceClass,new Destination());
            Log.e("Destination",destination.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (DataTypeNotPresentException e) {
            e.printStackTrace();
        }
    }
}