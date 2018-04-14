package generator.customAnnotation.impl;

import generator.Bundles.BundleTypes;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.IGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhatCanDoGenerator implements IGenerator<String> {

    private final IBundle<String> bundle = new BundleTypes();

    @Override
    public String generate() {
        return bundle.getRandom();
    }
}
