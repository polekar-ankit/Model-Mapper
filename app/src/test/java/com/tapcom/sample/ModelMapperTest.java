package com.tapcom.sample;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.tapcom.modelmapping.ModelMapper;
import com.tapcom.modelmapping.exeptions.DataTypeNotPresentException;
import com.tapcom.sample.Destination;
import com.tapcom.sample.SourceClass;
import com.tapcom.sample.SourceSubClass;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public  class ModelMapperTest {

    @Test
    public void test_map_function(){
        ArrayList<SourceSubClass>sourceClasses= new ArrayList<>();
        sourceClasses.add(new SourceSubClass("Ankit",100));
        sourceClasses.add(new SourceSubClass("Ankit",100));
        sourceClasses.add(new SourceSubClass("Ankit",100));
        sourceClasses.add(new SourceSubClass("Ankit",100));
        SourceClass sourceClass = new SourceClass("Hello",2,sourceClasses);
        ModelMapper modelMapper = new ModelMapper();
        Destination destination = new Destination();
        try {
            destination = modelMapper.Map(sourceClass,destination);
            assertNotNull(destination);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (DataTypeNotPresentException e) {
            e.printStackTrace();
        }
    }
}