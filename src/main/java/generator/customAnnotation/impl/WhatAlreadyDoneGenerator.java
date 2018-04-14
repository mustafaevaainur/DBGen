package generator.customAnnotation.impl;

import generator.Bundles.BundleLows;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.IGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhatAlreadyDoneGenerator implements IGenerator<String> {

        private final IBundle<String> bundle = new BundleLows();

        @Override
        public String generate() {
            return bundle.getRandom();
        }

}
