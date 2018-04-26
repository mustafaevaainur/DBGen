package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenGender;
import io.dummymaker.annotation.number.GenInteger;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenName;

public class GenderGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenGender
    private String gender;

    @Override
    public Integer getId() {
        return id;
    }
}
