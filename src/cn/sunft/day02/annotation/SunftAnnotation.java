package cn.sunft.day02.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.sunft.day01.enume.TrafficLamp;

/**
 * 定义注解,要加元注解
 * @author sunft
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface SunftAnnotation {
	String color() default "blue";
	String value();
	int[] arrayAttr() default {3, 4, 5};
	TrafficLamp lamp() default TrafficLamp.RED;
	MetaAnnotation annotationAttr() default @MetaAnnotation("1hm");
}




