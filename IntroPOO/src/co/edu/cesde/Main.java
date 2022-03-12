package co.edu.cesde;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro tesla = new Carro();
        //tesla.color = "Negro";
        tesla.encender();
        Carro mercedez = new Carro();
        //System.out.println(mercedez.color);
        tesla.setColor("verde");
        tesla.showColor();
        String color = tesla.getColor();
    }
}
