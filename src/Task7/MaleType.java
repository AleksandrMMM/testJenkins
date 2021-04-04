package Task7;

public enum MaleType {

    MALE("Mr."), FEMALE("Mrs.");

    private String prefixName;

    MaleType(String prefixName) {
        this.prefixName = prefixName;
    }

    public String getPrefixName() {
        return prefixName;
    }
}
