package stepDef;

public enum Sort {
    Дешевле("Дешевле"),
    Дороже("Дороже");

    private String value;

    public String getValue() {
        return value;
    }

    Sort(String value) {
        this.value = value;
    }
}
