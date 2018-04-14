package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenLow;
import generator.customAnnotation.annotations.GenPigsName;
import generator.customAnnotation.annotations.GenWhyCanDo;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenNoun;
import io.dummymaker.annotation.string.GenString;

public class WhatAlreadyDoneRel implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenLow
    private String action;

    @Override
    public Integer getId() {
        return id;
    }
}
