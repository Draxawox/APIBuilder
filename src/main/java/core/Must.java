package core;

import java.util.ArrayList;
import java.util.List;

public class Must extends Bool {
    public List<Match> match;

    public Must(List<Match> match) {
        super();
        this.match = match;
    }

    public Must mustMatch(String type, String value) {
        this.match.add(new Match(type, value));
        return this;
    }
    public Must mustMatch(String type, int value) {
        this.match.add(new Match(type, value));
        return this;
    }

    public Bool bool() {
        return this;
    }

    public List<Match> getMatch() {
        return match;
    }
}
