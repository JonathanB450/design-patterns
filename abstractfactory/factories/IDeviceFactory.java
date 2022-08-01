package abstractfactory.factories;

import abstractfactory.computers.IComputer;
import abstractfactory.smartphones.ISmartPhone;

public interface IDeviceFactory {
    IComputer createComputer();
    ISmartPhone  createSmartPhone();
}
