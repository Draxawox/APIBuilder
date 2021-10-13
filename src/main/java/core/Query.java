package core;


public class Query {
    public Bool bool;

    protected Query(Bool bool) {
        this.bool = bool;
    }

    public Bool getBool() {
        return bool;
    }
}
