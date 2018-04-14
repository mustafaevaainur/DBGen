package generator.customAnnotation.impl;

import generator.Bundles.BundleTypes;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.IGenerator;

public class TypeGenerator implements IGenerator<String> {
    private final IBundle<String> bundle = new BundleTypes();

    @Override
    public String generate() {
        return bundle.getRandom();
    }
}
