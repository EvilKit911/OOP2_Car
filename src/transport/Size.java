package transport;

public enum Size {
    NODATA,
    xs(10,25),
    S(26,50),
    M(51,80),
    L(81,120),
    XL(121,150);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    Size() {

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static Size getValue(int value) {
        for (Size i : Size.values()) {
            if (value >= i.getMin() && value <= i.getMax()) {
                return i;
            }
        }
        return null;
    }
}
