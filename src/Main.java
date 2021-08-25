import java.util.Arrays;

import model.Kotik;

import static model.Kotik.number;

public class Main {

    public static void main(String[] args) {
        Kotik cat1 = new Kotik();
        Kotik cat2 = new Kotik("Musya", 5, 5);

        cat1.setKotik("Kusya", 2, 1);

        cat2.Eat(40, "meat");
        cat2.liveAnotherDay();

        cat1.liveAnotherDay();

        System.out.println("Number of cats: " + number );

        if (cat1.getName().equals(cat2.getName())){
            System.out.println("Names are the same");
        }
        else{
            System.out.println("Names are different ");
        }
    }
}
