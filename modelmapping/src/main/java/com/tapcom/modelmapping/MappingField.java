package com.tapcom.modelmapping;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * annotate class parameter with 'MappingField' and pass parameter name to which annotated field value will be map
 * <br>eg.
 * <br>
 * <code>
 * class A {
 *      <br>
 *     MappingField(name="param")
 *     <br>
 *     String value;
 *     <br>
 * }
 * </code>
 * <br>
 * <br>
 *  <code>
 *      class B {
 *          <br>
 *          String param;
 *         <br>
 *        }
 * </code>
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MappingField {
    String name();
}
