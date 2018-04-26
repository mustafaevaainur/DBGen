package generator.customAnnotation.impl;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class CityGenerator implements IGenerator<Integer> {

    @Override
    public Integer generate() {
        int maxNumber = 55;

        Random r = new Random();
        return r.nextInt(maxNumber)+1;
    }
}
