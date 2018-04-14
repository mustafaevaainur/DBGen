package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenPigsName;
import generator.customAnnotation.annotations.GenReason;
import generator.customAnnotation.annotations.GenWhyCanDo;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenNoun;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.string.GenString;

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
