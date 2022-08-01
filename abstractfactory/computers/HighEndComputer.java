package abstractfactory.computers;

public class HighEndComputer implements IComputer {

    @Override
    public void buy() {
        System.out.print("You have bought a high end computer");
    }
    
}
