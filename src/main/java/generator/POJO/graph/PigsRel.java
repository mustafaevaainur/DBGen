package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenPigsName;
import generator.customAnnotation.annotations.GenWhyCanDo;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenName;

public class PigsRel implements DBObject{

    @GenEnumerate(from = 1)
    private Integer id;

    @GenName
    private String name;

    @Override
    public Integer getId() {
        return id;
    }
}
