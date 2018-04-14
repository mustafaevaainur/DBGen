package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenType;
import io.dummymaker.annotation.special.GenEnumerate;

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
