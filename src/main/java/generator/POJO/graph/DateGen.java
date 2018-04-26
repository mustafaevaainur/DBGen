package generator.POJO.graph;

import generator.POJO.DBObject;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.time.GenDate;

public class DateGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenDate
    private String date;

    @Override
    public Integer getId() {
        return id;
    }
}
