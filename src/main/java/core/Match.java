package core;

public class Match {
    private String type;
    private String StringValue;
    private int intValue;

    protected Match(String type, String StringValue) {
        this.type = type;
        this.StringValue = StringValue;
    }
    protected Match(String type, int intValue) {
        this.type = type;
        this.intValue = intValue;
    }
}
