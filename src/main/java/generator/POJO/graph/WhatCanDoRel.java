package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenLow;
import generator.customAnnotation.annotations.GenType;
import generator.customAnnotation.annotations.GenWhatCanDo;
import generator.customAnnotation.annotations.GenWhyCanDo;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.special.GenForceExport;
import io.dummymaker.annotation.string.GenNick;
import io.dummymaker.annotation.string.GenNoun;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.string.GenString;

public class WhatCanDoRel implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenType
    private String action;

    @Override
    public Integer getId() {
        return id;
    }

}
