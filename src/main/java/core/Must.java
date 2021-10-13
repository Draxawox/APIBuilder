package core;

import java.util.ArrayList;
import java.util.List;

public class Must extends Bool {
    private List<Match> match;

    public Must() {
        this.match = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Must{" +
                "match=" + match +
                '}';
    }
}
