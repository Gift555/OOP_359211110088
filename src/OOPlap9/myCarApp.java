package OOPlap9;


import javax.swing.text.Style;

public class myCarApp {
    public static void main(String[] args) {
        Engine engine = new Engine("1500 cc",
                "V-TEC V4");
        car car = new car("Honda", "black",
                "City", engine);
        System.out.println(car.toString());

        car car1 = new car("Toyota", "Red",
                "Altis", engine);
        System.out.println(car1.toString());


    }//main
}//class


