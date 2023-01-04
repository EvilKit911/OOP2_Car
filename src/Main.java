import transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",120 ,1.7);
        Car audi = new Car("Audi","A8 50 L TDI quattro",180,3);
        Car bmw = new Car("BMW","Z8",180,3);
        Car kia = new Car("Kia","Sportage 4-го поколения",160,2.4);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println("");

        Bus paz = new Bus("ПАЗ","3205",90, 4.5);
        Bus liaz = new Bus("ЛиАЗ","5292",110,6.9);
        Bus hyunday = new Bus("Hyunday","County",100,3.9);
        Bus mersedes = new Bus("Mersedes","Setra 531 DT",120,12.8);

        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(hyunday);
        System.out.println(mersedes);
        System.out.println("");

        Truck daf = new Truck("DAF","FX 105",85,12.9);
        Truck renault = new Truck("Renault","T-Series",90,12.4);
        Truck volvo = new Truck("Volvo","FH 16",95,14.4);
        Truck scania = new Truck("Scania","S730 V8",100,16.4);
        System.out.println(daf);
        System.out.println(renault);
        System.out.println(volvo);
        System.out.println(scania);
        System.out.println(" ");

        DriverB nikita = new DriverB("Никита", true,1 );
        DriverC artem = new DriverC("Артем",true,4);
        DriverD alexandr = new DriverD("Александр",true,12);

        nikita.startMove(audi);
        nikita.refuel(audi);
        nikita.stopMove(audi);
        nikita.printInfo(audi);
        System.out.println(" ");
        artem.startMove(renault);
        artem.refuel(renault);
        artem.stopMove(renault);
        artem.printInfo(renault);
        System.out.println(" ");
        alexandr.startMove(paz);
        alexandr.refuel(paz);
        alexandr.stopMove(paz);
        alexandr.printInfo(paz);
    }
}