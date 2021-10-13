package core;

public class Match {
    public String type;
    public String StringValue;
    public int intValue;

    protected Match(String type, String StringValue) {
        this.type = type;
        this.StringValue = StringValue;
    }
    protected Match(String type, int intValue) {
        this.type = type;
        this.intValue = intValue;
    }
}
