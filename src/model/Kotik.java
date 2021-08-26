package model;

public class Kotik {
    private int energy, weight, age;
    public static int number;
    private String name, phrase;



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

    private void hungryCat(){
        if (energy <= 0){
            System.out.println("I am hungry! Feed me right now");
        }
        else{
            System.out.println(phrase);
            energy -= 1;
        }
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
        phrase = "Прыг";
        hungryCat();

    }

    public void Sleep(){
        phrase = "Z-z-z";
        hungryCat();

    }

    public void Purr(){
        phrase = "prrrrrr";
        hungryCat();

    }

    public void Lick(){
        phrase = "*lick*";
        hungryCat();

    }

    public void Play(){
        phrase = ")";
        hungryCat();

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
