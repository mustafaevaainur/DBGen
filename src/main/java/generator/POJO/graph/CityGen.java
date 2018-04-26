package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAge;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;

public class CityGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenCity
    private String city;

    @Override
    public Integer getId() {
        return id;
    }
}
