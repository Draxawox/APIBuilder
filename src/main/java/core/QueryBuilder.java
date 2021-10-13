package core;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class QueryBuilder {
    private Query query;

    public QueryBuilder() {
        this.query = new Query();
    }

    public Query getQuery() {
        return query;
    }

    public Bool bool() {
        return getQuery().getBool();
    }


    public void convertToJSON() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("src\\main\\resources\\query.json"), this);
            String json = mapper.writeValueAsString(this);
            System.out.println(json);
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
