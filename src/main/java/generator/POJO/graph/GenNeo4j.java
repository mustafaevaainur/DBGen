package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenLow;
import generator.customAnnotation.annotations.GenReason;
import generator.customAnnotation.annotations.GenType;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenName;

public class GenNeo4j implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenName
    private String name;

    @GenLow
    private String low;

    @GenType
    private String action_type;

    @GenReason
    private String reason;

    @Override
    public Integer getId() {
        return id;
    }
}
