package generator.customAnnotation.annotations;

import generator.customAnnotation.impl.WhyCanDoGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@PrimeGen(WhyCanDoGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenWhyCanDo {}
