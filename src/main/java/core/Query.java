package core;


public class Query {
    private Bool bool;

    protected Query() {
        this.bool = new Bool();
    }

    public Bool getBool() {
        return bool;
    }
}
