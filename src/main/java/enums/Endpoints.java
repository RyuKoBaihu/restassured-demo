package enums;

public enum Endpoints {
    VOTES("/v1/votes");

    private final String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
