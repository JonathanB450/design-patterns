package abstractfactory;

import java.util.Scanner;

import abstractfactory.computers.IComputer;
import abstractfactory.factories.HighEndFactory;
import abstractfactory.factories.IDeviceFactory;
import abstractfactory.factories.LowEndFactory;
import abstractfactory.smartphones.ISmartPhone;

public class Main{
    public static void main(String[] args){
        IComputer computer;
        ISmartPhone smartPhone;
        IDeviceFactory computerFactory;
        IDeviceFactory smartPhoneFactory;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your budget $$$: ");
        Integer budget = Integer.parseInt(scanner.next());

        if(budget >= 10000){
            computerFactory = new HighEndFactory();
            smartPhoneFactory = new HighEndFactory();
        }
        else if(budget >= 5000  && budget < 10000){
            computerFactory = new HighEndFactory();
            smartPhoneFactory = new LowEndFactory();
        }
        else if(budget >= 3000  && budget < 5000){
            computerFactory = new LowEndFactory();
            smartPhoneFactory = new HighEndFactory();
        }
        else{
            computerFactory = new LowEndFactory();
            smartPhoneFactory = new LowEndFactory();
        }
        computer = computerFactory.createComputer();
        smartPhone = smartPhoneFactory.createSmartPhone();
        buyDevices(computer, smartPhone);

    }

    public static void buyDevices(IComputer computer, ISmartPhone smartPhone){
        computer.buy();
        System.out.println("\n");
        smartPhone.buy();
    }
}