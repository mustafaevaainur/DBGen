package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenReason;
import io.dummymaker.annotation.special.GenEnumerate;

public class WhyCanDoRel implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenReason
    private String action;

    @Override
    public Integer getId() {
        return id;
    }
}
