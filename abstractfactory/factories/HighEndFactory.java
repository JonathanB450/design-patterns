package abstractfactory.factories;

import abstractfactory.computers.IComputer;
import abstractfactory.smartphones.HighEndSmartPhone;
import abstractfactory.smartphones.ISmartPhone;
import abstractfactory.computers.HighEndComputer;

public class HighEndFactory implements IDeviceFactory{

    @Override
    public IComputer createComputer() {
        return new HighEndComputer();
    }

    @Override
    public ISmartPhone createSmartPhone() {
        return new HighEndSmartPhone();
    }

}