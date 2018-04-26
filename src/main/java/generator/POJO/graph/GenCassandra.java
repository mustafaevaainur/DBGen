package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenAge;
import generator.customAnnotation.annotations.GenReason;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.time.GenDate;

public class GenCassandra implements DBObject {
    @GenEnumerate(from = 1)
    private Integer id;

    @GenReason
    private String description;

    @GenDate
    private String date;

    /*----------чуть-чуть не реализовано----------*/
    /*set_of_crimes (set<text>)*/

    @Override
    public Integer getId() {
        return id;
    }
}
