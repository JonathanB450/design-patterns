package abstractfactory.factories;

import abstractfactory.computers.IComputer;
import abstractfactory.computers.LowEndComputer;
import abstractfactory.smartphones.ISmartPhone;
import abstractfactory.smartphones.LowEndSmartPhone;

public class LowEndFactory implements IDeviceFactory{

    @Override
    public IComputer createComputer() {
        return new LowEndComputer();
    }

    @Override
    public ISmartPhone createSmartPhone() {
        return new LowEndSmartPhone();
    }


}