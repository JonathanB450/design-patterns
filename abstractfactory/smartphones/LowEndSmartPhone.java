package abstractfactory.smartphones;

public class LowEndSmartPhone implements ISmartPhone{

    @Override
    public void buy() {
        System.out.print("You have bought a low end smart phone");
    }
    
}