package generator.POJO.graph;

import generator.POJO.DBObject;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenId;

public class IdGen implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenId
    private Integer idNum;

    @Override
    public Integer getId() {
        return id;
    }
}
