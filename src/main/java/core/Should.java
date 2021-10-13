package core;

import java.util.ArrayList;
import java.util.List;

public class Should extends Bool {
    private List<Match> match;

    public Should() {
        this.match = new ArrayList<>();
    }

    public List<Match> getMatch() {
        return match;
    }

    public Should shouldMatch(String type, String value) {
        this.match.add(new Match(type, value));
        return this;
    }
    public Should shouldMatch(String type, int value) {
        this.match.add(new Match(type, value));
        return this;
    }
    public Bool bool() {
        return this;
    }
}
