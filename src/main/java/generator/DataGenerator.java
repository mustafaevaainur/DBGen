package generator;

import generator.POJO.*;

import generator.POJO.graph.*;
import generator.customAnnotation.impl.PigsNameGenerator;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private final int pigsNumber = 2000000;

    private final int pigsNameNumber = pigsNumber;
    private final int whatCanDoNumber = pigsNumber;
    private final int whatAlreadyDoneNumber = pigsNumber;
    private final int whyCanDoNumber = pigsNumber;


    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new CsvExporter();

    public void generate() {


        /* generate data for graph */
        generateObject(PigsRel.class, pigsNameNumber);
        generateObject(WhatAlreadyDoneRel.class, whatAlreadyDoneNumber);
        generateObject(WhatCanDoRel.class, whatCanDoNumber);
        generateObject(WhyCanDoRel.class, whyCanDoNumber);

    }

    private <T extends DBObject> List<Integer> generateObject(Class<T> tClass, int amount) {
        List<T> tList = factory.produce(tClass, amount);
        List<Integer> ids = new ArrayList<>(amount);
        exporter.export(tList);
        for (T tObj : tList) {
            ids.add(tObj.getId());
        }
        return ids;
    }
}
