package com.tapcom.modelmapping;

import com.tapcom.modelmapping.exeptions.DataTypeNotPresentException;

import java.lang.reflect.Field;


public class ModelMapper {

    /**
     * map/convert or copy source class parameter to destination class using MappingField annotation
     *
     * @param sourceClass
     * @param destination
     * @param <T>
     * @param <V>
     * @return
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     * @throws DataTypeNotPresentException : throw exception when source and destination data type are not match
     */
    public <T, V> V Map(T sourceClass, V destination) throws IllegalAccessException, NoSuchFieldException, DataTypeNotPresentException {
        Field[] sourceFiled = sourceClass.getClass().getDeclaredFields();

        for (Field field :
                sourceFiled) {
            MappingField annotation = field.getAnnotation(MappingField.class);
            String fieldName = null;
            if (annotation != null) {
                fieldName = annotation.name();
                Field desField = destination.getClass().getDeclaredField(fieldName);
                if(!field.isAccessible()){
                    field.setAccessible(true);
                }
                if (desField.getType() == field.getType()) {
                    if(!desField.isAccessible()){
                        desField.setAccessible(true);
                    }
                    desField.set(destination, field.get(sourceClass));
                } else
                    throw new DataTypeNotPresentException(fieldName + " is not found on " + destination.getClass());
            }

        }
        return destination;
    }
}
