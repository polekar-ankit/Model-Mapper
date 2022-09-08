package com.tapcom.sample;

import com.tapcom.modelmapping.MappingField;

public class SourceSubClass {
    @MappingField(name = "name")
    String name;
    @MappingField(name = "id")
    int value;

    public SourceSubClass(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
