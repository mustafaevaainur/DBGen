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

    private final int pigsNumber = 2000;
    /*private final int operatorsNumber = OperatorGenerator.getOperatorsNumber();
    private final int doneActionsNumber = 40;
    private final int didNumber = 50;
    private final int whyCanDoNumber = 40;*/

   /* private final int tariffsActivationNumber = pigsNumber;
    private final int optionsActivationNumber = pigsNumber;
    private final int usagePerMonthNumber = pigsNumber;*/

    private final int pigsNameNumber = pigsNumber;
    private final int whatCanDoNumber = pigsNumber;
    private final int whatAlreadyDoneNumber = pigsNumber;
    private final int whyCanDoNumber = pigsNumber;

    /*private List<Integer> usersId;
    private List<Integer> operatorsId;
    private List<Integer> optionsId;
    private List<Integer> citiesId;
    private List<Integer> tariffsId;

    private List<OptionActivation> optionActivations;
    private List<TariffActivation> tariffActivations;*/
    /*private List<UsesOptionRel> usesOptionRels = new ArrayList<>();
    private List<UsesTariffRel> usesTariffRels = new ArrayList<>();*/

    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new CsvExporter();

    public void generate() {

        /* generate data for document-oriented *//*
        usersId = generateObject(User.class, pigsNumber);
        operatorsId = generateObject(Operator.class, operatorsNumber);
        optionsId = generateObject(Option.class, doneActionsNumber);
        citiesId = generateObject(City.class, didNumber);
        tariffsId = generateObject(Tariff.class, whyCanDoNumber);


        *//* generate data for column-oriented *//*
        tariffActivations = generateColumnObject(TariffActivation.class, tariffsActivationNumber);
        optionActivations = generateColumnObject(OptionActivation.class, optionsActivationNumber);
        generateColumnObject(UsagePerMonth.class, usagePerMonthNumber);*/


        /* generate data for graph */
        generateObject(PigsRel.class, pigsNameNumber);
        generateObject(WhatAlreadyDoneRel.class, whatAlreadyDoneNumber);
        generateObject(WhatCanDoRel.class, whatCanDoNumber);
        generateObject(WhyCanDoRel.class, whyCanDoNumber);

        /*for (TariffActivation ta : tariffActivations) {
            usesTariffRels.add(new UsesTariffRel(ta.getId(), ta.getTariffId()));
        }
        exporter.export(usesTariffRels);
        tariffActivations.clear();
        usesTariffRels.clear();

        for (OptionActivation oa : optionActivations) {
            usesOptionRels.add(new UsesOptionRel(oa.getId(), oa.getOptionId()));
        }
        exporter.export(usesOptionRels);
        optionActivations.clear();
        usesOptionRels.clear();*/

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

    private <T extends DBObject> List<T> generateColumnObject(Class<T> tClass, int amount) {
        List<T> tList = factory.produce(tClass, amount);
        exporter.export(tList);
        return tList;
    }
}
