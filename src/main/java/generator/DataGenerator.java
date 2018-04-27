package generator;

import generator.POJO.*;

import generator.POJO.graph.*;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.export.impl.JsonExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private final int pigsNumber = 200;

    private final int ageNumber = pigsNumber;
    private final int cityNumber = pigsNumber;
    private final int reasonNumber = pigsNumber;
    private final int genderNum = pigsNumber;

    private final int pigsNameNumber = pigsNumber;
    private final int whatCanDoNumber = pigsNumber;
    private final int whatAlreadyDoneNumber = pigsNumber;
    private final int whyCanDoNumber = pigsNumber;

    private final int idNumber = pigsNumber;
    private final int descriptionNumber = pigsNumber;
    private final int dateNumber = pigsNumber;

    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new JsonExporter();

    public void generate() {

        /*mongo*/
        generateObject(GenMongo.class, ageNumber);
        generateObject(GenMongo.class, cityNumber);
        generateObject(GenMongo.class, reasonNumber);
        generateObject(GenMongo.class, genderNum);

        /*cassandra*/
        generateObject(GenCassandra.class, idNumber);
        generateObject(GenCassandra.class , descriptionNumber);
        generateObject(GenCassandra.class, dateNumber);

        /* generate data for graph */
        generateObject(GenNeo4j.class, pigsNameNumber);
        generateObject(GenNeo4j.class, whatAlreadyDoneNumber);
        generateObject(GenNeo4j.class, whatCanDoNumber);
        generateObject(GenNeo4j.class, whyCanDoNumber);

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
