package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenLow;
import io.dummymaker.annotation.special.GenEnumerate;

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
