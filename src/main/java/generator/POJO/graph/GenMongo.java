package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAge;
import generator.customAnnotation.annotations.GenGender;
import generator.customAnnotation.annotations.GenReason;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenName;
import io.dummymaker.annotation.string.GenNoun;

public class GenMongo implements DBObject {
    @GenEnumerate(from = 1)
    private Integer id;

    @GenName
    private String name;

    @GenGender
    private String gender;

    @GenAge
    private Integer age;

    @GenNoun
    private String what_take;

    @GenNoun
    private String what_left;


    @GenCity
    private String city;

    @GenReason
    private String reason;

    @Override
    public Integer getId() {
        return id;
    }
}
