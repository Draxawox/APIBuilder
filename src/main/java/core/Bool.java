package core;

import java.util.ArrayList;

public class Bool {
    private Must must;
    private Should should;

    public Bool(Must must, Should should) {
        this.must = must;
        this.should = should;
    }

    public Bool() {

    }

    public Should shouldMatch(String type, String value) {
        if (this.getShould() == null) {
            this.should = new Should(new ArrayList<>());
        }
        this.should.getMatch().add(new Match(type, value));
        return this.should;
    }
    public Should shouldMatch(String type, int value) {
        if (this.getShould() == null) {
            this.should = new Should(new ArrayList<>());
        }
        this.should.getMatch().add(new Match(type, value));
        return this.should;
    }
    public Must mustMatch(String type, String value) {
        if (this.getMust() == null) {
            this.must = new Must(new ArrayList<>());
        }
        this.getMust().getMatch().add(new Match(type, value));
        return this.must;
    }

    public Must mustMatch(String type, int value) {
        if (this.getMust() == null) {
            this.must = new Must(new ArrayList<>());
        }
        this.must.getMatch().add(new Match(type, value));
        return this.must;
    }

    public Must getMust() {
        return must;
    }

    public Should getShould() {
        return should;
    }
}
