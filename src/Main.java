import transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoLicenseExeption {
        Car lada = new Car("Lada","Granta",120 ,1.7,BodyType.HATCHBACK);
        Car audi = new Car("Audi","A8 50 L TDI quattro",180,3);
        Car bmw = new Car("BMW","Z8",180,3);
        Car kia = new Car("Kia","Sportage 4-го поколения",160,2.4,BodyType.COUPE);

        lada.getParticipantsRace().add(lada);//
        audi.getParticipantsRace().add(audi);
        bmw.getParticipantsRace().add(bmw);
        kia.getParticipantsRace().add(kia);
        
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println("");

        Bus paz = new Bus("ПАЗ","3205",90, 4.5,Size.getValue(25));
        Bus liaz = new Bus("ЛиАЗ","5292",110,6.9,Size.getValue(30));
        Bus hyunday = new Bus("Hyunday","County",100,3.9,Size.getValue(76));
        Bus mersedes = new Bus("Mersedes","Setra 531 DT",120,12.8);

        paz.getParticipantsRace().add(paz);
        liaz.getParticipantsRace().add(liaz);
        hyunday.getParticipantsRace().add(hyunday);
        mersedes.getParticipantsRace().add(mersedes);
//
//        System.out.println(paz);
//        System.out.println(liaz);
//        System.out.println(hyunday);
//        System.out.println(mersedes);
//        System.out.println("");

        Truck daf = new Truck("DAF","FX 105",85,12.9,LoadCopasity.getValue(10));
        Truck renault = new Truck("Renault","T-Series",90,12.4,LoadCopasity.getValue(18));
        Truck volvo = new Truck("Volvo","FH 16",95,14.4,LoadCopasity.getValue(20));
        Truck scania = new Truck("Scania","S730 V8",100,16.4);

        daf.getParticipantsRace().add(daf);
        renault.getParticipantsRace().add(renault);
        volvo.getParticipantsRace().add(volvo);
        scania.getParticipantsRace().add(scania);


        lada.checkRaceList();
//        System.out.println(daf);
//        System.out.println(renault);
//        System.out.println(volvo);
//        System.out.println(scania);
//        System.out.println(" ");

        DriverB nikita = new DriverB("Никита", true,1,"B");
        DriverC artem = new DriverC("Артем",true,4,"C");
        DriverD alexandr = new DriverD("Александр",true,12,"D");




//        nikita.startMove(audi);
//        nikita.refuel(audi);
//        nikita.stopMove(audi);
//        nikita.printInfo(audi);
//        System.out.println(" ");
//        artem.startMove(renault);
//        artem.refuel(renault);
//        artem.stopMove(renault);
//        artem.printInfo(renault);
//        System.out.println(" ");
//        alexandr.startMove(paz);
//        alexandr.refuel(paz);
//        alexandr.stopMove(paz);
//        alexandr.printInfo(paz);

       daf.passDiagnostics();
       lada.passDiagnostics();
       lada.repairTransport();
        paz.repairTransport();

    }
}