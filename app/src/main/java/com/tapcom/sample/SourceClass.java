package com.tapcom.sample;

import com.tapcom.modelmapping.MappingField;

public class SourceClass {
    @MappingField(name = "name")
    String name;
    @MappingField(name = "id")
    int value;

    public SourceClass(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
