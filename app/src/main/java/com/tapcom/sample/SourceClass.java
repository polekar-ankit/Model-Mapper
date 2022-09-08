package com.tapcom.sample;

import com.tapcom.modelmapping.MappingField;

import java.util.ArrayList;

public class SourceClass {
    @MappingField(name = "name")
    String name;
    @MappingField(name = "id")
    int value;

    @MappingField(name = "sourceSubClass")
    ArrayList<SourceSubClass> sourceSubClass;

    public SourceClass(String name, int value, ArrayList<SourceSubClass> sourceSubClass) {
        this.name = name;
        this.value = value;
        this.sourceSubClass = sourceSubClass;
    }
}
