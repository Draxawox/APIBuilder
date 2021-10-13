package core;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QueryBuilder {
    public Query query;

    public QueryBuilder() {
        this.query = new Query(new Bool(new Must(new ArrayList<>()), new Should(new ArrayList<>())));
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
