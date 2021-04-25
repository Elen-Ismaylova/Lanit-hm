package Model;

import java.util.Random;

public class Kote {
    private int weight; //вес//
    private int saturation; //насыщенность кота//
    private String name; //имя кота//
    private int prettiness; //внешная красота//
    private String meow;
    private String owner; //хозяин/

    public Kote() {

        this.saturation = 0;
        this.owner = null;
        this.name = null;
        this.weight = 0;
        this.prettiness = 0;
        this.meow = null;
    }

    public Kote(String name, int saturation, String owner, int weight, int prettiness, String meow) {

        this.saturation = saturation;
        this.owner = owner;
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
        this.meow = meow;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setCat(String name, int saturation, String owner, int weight, int prettiness, String meow) {

        this.saturation = saturation;
        this.owner = owner;
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
        this.meow = meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Deprecated
    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private boolean sleep() {
        if (saturation < 0) {
            saturation++;
            System.out.println("Идет спать ...");
            return false;
        } else {
            System.out.println("Покорми меня!");
        }
        return true;
    }

    private boolean purr() {
        if (saturation > 0) {
            saturation++;
            System.out.println("Играет с игрушкой ...");
            return true;
        } else {
            System.out.println("Покорми меня!");
        }
        return false;
    }

    private boolean meow() {
        if (saturation > 0) {
            saturation++;
            System.out.println(meow);
            return true;
        } else {
            System.out.println("Покорми меня!");
        }
        return false;
    }

    private boolean run() {
        if (saturation > 0) {
            saturation++;
            System.out.println("Бегает ...");
            return true;
        } else {
            System.out.println("Покорми меня!");
        }
        return false;
    }

    private boolean eat(int saturation) {
        this.saturation += saturation;
        System.out.println("Вкусно!" + this.saturation);
        return true;
    }

    private boolean eat(int saturation, String food) {
        this.saturation = this.saturation + saturation * saturation;
        System.out.println("Вкусно!" + this.saturation);
        return true;
    }

    private boolean eat() {
        return eat(1, "Food");

    }

    public void liveAnotherDay() {
        Random random = new Random();
        for (int i = 0; i < 24; i++) {
            int randomInt = random.nextInt(4);
            if (saturation <= 0) {
                System.out.println("Накормить кота ...");
                saturation++; //накормить кота
            }
            switch (randomInt) {
                case 0:
                    run();
                    break;
                case 1:
                    eat();
                    break;
                case 2:
                    meow();
                    break;
                case 3:
                    purr();
                    break;
                case 4:
                    sleep();
                    break;
            }
        }
        this.saturation--;

    }
}
