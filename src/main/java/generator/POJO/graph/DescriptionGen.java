package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenGender;
import generator.customAnnotation.annotations.GenReason;
import io.dummymaker.annotation.special.GenEnumerate;

public class DescriptionGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenReason
    private String reason;

    @Override
    public Integer getId() {
        return id;
    }
}
