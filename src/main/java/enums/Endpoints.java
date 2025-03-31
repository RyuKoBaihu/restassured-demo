package enums;

public enum Endpoints {
    PRODUCTS("products"),
    ORDER("order");

    private final String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
