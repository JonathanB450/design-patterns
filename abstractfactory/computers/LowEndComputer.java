package abstractfactory.computers;

public class LowEndComputer implements IComputer{

    @Override
    public void buy() {
        System.out.print("You have bought a low end computer");
    }
    
}
