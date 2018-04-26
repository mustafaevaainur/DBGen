package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAge;
import io.dummymaker.annotation.special.GenEnumerate;

public class AgeGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenAge
    private Integer age;

    @Override
    public Integer getId() {
        return id;
    }
}
