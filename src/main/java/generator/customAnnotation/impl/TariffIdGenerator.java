package generator.customAnnotation.impl;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class TariffIdGenerator implements IGenerator<Integer> {

    @Override
    public Integer generate() {
        int maxNumber = 40;

        Random r = new Random();
        return r.nextInt(maxNumber);
    }

}