package com.tapcom.sample;

import org.junit.Test;

import static org.junit.Assert.*;

import com.tapcom.modelmapping.ModelMapper;
import com.tapcom.modelmapping.exeptions.DataTypeNotPresentException;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        SourceClass sourceClass = new SourceClass("Hello",2,new SourceSubClass("Ankit",100));
        try {
          Destination destination =   new ModelMapper().Map(sourceClass,new Destination());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (DataTypeNotPresentException e) {
            e.printStackTrace();
        }
    }
}