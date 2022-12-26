import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",1.7 ,"Желтый",2015, "Россия","Седан","к123ув345",120);
        Car audi = new Car("Audi","A8 50 L TDI quattro",3,"Чёрный",2020, "Германия","Седан", "у564ке432",180);
        Car bmw = new Car("BMW","Z8",3,"Чёрный",2021, "Германия","","н432го895",0);
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018, "Южная Корея","Седан","",0);
        Car hyndai = new Car("Hyndai","Avante",1.6,"Оранжевый",2016, "Южная Корея","","",0);
lada.setGearBox("Мкпп");audi.setGearBox("Мкпп");bmw.setGearBox("Акпп");kia.setGearBox("Мкпп");hyndai.setGearBox("Акпп");
lada.setNuberOfSeats(0);audi.setNuberOfSeats(0);bmw.setNuberOfSeats(0);kia.setNuberOfSeats(0);hyndai.setNuberOfSeats(0);
    kia.changeTyres();
bmw.setColor("Красный");// для теста =)



        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyndai);
        System.out.println("");

        Bus paz = new Bus("ПАЗ","3205",1989,"СССР","",90);
        Bus liaz = new Bus("ЛиАЗ","5292",2022,"Россия","Небесно-голубой",110);
        Bus hyunday = new Bus("Hyunday","County",2004,"Южная Корея", "Белый", 110);

        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(hyunday);

    }
}