package generator.customAnnotation.impl;

import generator.Bundles.BundleGender;
import generator.Bundles.BundleLows;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class GenderGenerator implements IGenerator<String> {

        private final IBundle<String> bundle = new BundleGender();

        @Override
        public String generate() {
                return bundle.getRandom();
        }

}
