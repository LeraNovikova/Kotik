package model;

public class Kotik {
    private int energy, weight, age;
    public static int number;
    private String name;

    public Kotik(){
        number++;
    }

    public Kotik(String name,int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        number++;
    }

    public void setKotik(String name,int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void Eat(int food){
        energy += food;
        System.out.println("Я поел " + food + "еды");

    }

    public void Eat(int food, String nfood){
        energy += food;
        System.out.println("Я поел " + food +" (" + nfood + ")");

    }

    public void Jump(){
        energy -= 1;
        System.out.println("Прыг");

    }

    public void Sleep(){
        energy -= 1;
        System.out.println("Z-z-z");

    }

    public void Purr(){
        energy -= 1;
        System.out.println("prrrrrr");

    }

    public void Lick(){
        energy -= 1;
        System.out.println("*lick*");

    }

    public void Play(){
        energy -= 1;
        System.out.println(")");

    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++){
            System.out.print(i+1 + " ");
            switch ((int)(Math.random() * 5 + 1)){
                case 1 : Play();
                    break;
                case 2: Lick();
                    break;
                case 3 : Purr();
                    break;
                case 4: Jump();
                    break;
                case 5 : Sleep();
                    break;
            }

        }
        System.out.println();

    }

}
