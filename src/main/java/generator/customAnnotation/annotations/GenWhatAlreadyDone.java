package generator.customAnnotation.annotations;

import generator.customAnnotation.impl.WhatAlreadyDoneGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PrimeGen(WhatAlreadyDoneGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenWhatAlreadyDone {
}
