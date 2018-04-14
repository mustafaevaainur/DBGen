package generator.customAnnotation.impl;

import generator.Bundles.BundleLows;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.IGenerator;

public class LowGenerator implements IGenerator<String> {
    private final IBundle<String> bundle = new BundleLows();

    @Override
    public String generate() {
        return bundle.getRandom();
    }
}
