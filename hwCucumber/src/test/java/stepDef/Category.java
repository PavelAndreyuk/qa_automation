package stepDef;

public enum Category {
    оргтехникаИРасходники(99),
    готовыйБизнес(116),
    одеждаОбувьАксессуары(27);

    private String value;

    public String getValue() {
        return value;
    }

    Category(int value) {
        this.value = Integer.toString(value);
    }
}
