package core;

public class Bool {
    private Must must;
    private Should should;

    public Bool() {
        must = new Must();
        should = new Should();
    }

    public Should shouldMatch(String type, String value) {
        this.should.getMatch().add(new Match(type, value));
        return this.should;
    }
    public Should shouldMatch(String type, int value) {
        this.should.getMatch().add(new Match(type, value));
        return this.should;
    }
    public Must mustMatch(String type, String value) {
        this.must.getMatch().add(new Match(type, value));
        return this.must;
    }

    public Must mustMatch(String type, int value) {
        this.must.getMatch().add(new Match(type, value));
        return this.must;
    }

    public Must getMust() {
        return must;
    }

    public Should getShould() {
        return should;
    }

    /*

    public Bool mustMatch(String type, String value) {
        must.getMatch().add(new Match(type, value));
        return this;
    }

    public Bool mustMatch(String type, int value) {
        must.getMatch().add(new Match(type, value));
        return this;
    }
    public Bool shouldMatch(String type, String value) {
        should.getMatch().add(new Match(type, value));
        return this;
    }

    public Bool shouldMatch(String type, int value) {
        should.getMatch().add(new Match(type, value));
        return this;
    }
*/

    @Override
    public String toString() {
        return "Bool{" +
                "must=" + must +
                ", should=" + should +
                '}';
    }
}
