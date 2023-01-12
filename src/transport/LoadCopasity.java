package transport;

public enum LoadCopasity {
    NODATA,// добавил на случай не ввода данных
    N1(3.5,12),
    N2(13,20),
    N3(21,500);


    private double min;
    private double max;

    LoadCopasity(double min, double max){
        this.min = min;
        this.max = max;
    }

    LoadCopasity() {

    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static LoadCopasity getValue(double value) {
        for (LoadCopasity i : LoadCopasity.values()) {
            if (value >= i.getMin() && value <= i.getMax()) {
               // System.out.println("Относиться к классу грузоподьёмности : " + i );
                return i;
            }
        }
        return null;
    }
}
