import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",1.7 ,"Желтый",2015, "Россия","Седан","к123ув345");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3,"Чёрный",2020, "Германия","Седан", "у564ке432");
        Car bmw = new Car("BMW","Z8",3,"Чёрный",2021, "Германия","","н432го895");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018, "Южная Корея","Седан","");
        Car hyndai = new Car("Hyndai","Avante",1.6,"Оранжевый",2016, "Южная Корея","","");
lada.setGearBox("Мкпп");audi.setGearBox("Мкпп");bmw.setGearBox("Акпп");kia.setGearBox("Мкпп");hyndai.setGearBox("Акпп");
lada.setNuberOfSeats(0);audi.setNuberOfSeats(0);bmw.setNuberOfSeats(0);kia.setNuberOfSeats(0);hyndai.setNuberOfSeats(0);
    kia.changeTyres();




        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyndai);


    }
}