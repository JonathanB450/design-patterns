package abstractfactory.smartphones;

public class HighEndSmartPhone implements ISmartPhone{

    @Override
    public void buy() {
        System.out.print("You have bought a high end smart phone");
    }
    
}