package tanks;


public class Launcher1 {

	public static void main(String[] args) {

    Reference ref1 = new Reference("ref1");
    Reference ref2 = new Reference("ref2");
    Reference ref3 = new Reference("ref3");

    ref1.setRef(ref2);
    ref2.setRef(ref3);
    ref3.setRef(ref1);

    ref1.printRef();
    ref2.printRef();
    ref3.printRef();
    
    System.out.println(TankColor.DARK_GREEN);
        float salary = 100000.0f;

        int salaryDiscount = salary == 90000?3000:2000;

        System.out.println(salaryDiscount);
    }

}
