package Model;

public class Application {

    public static void main(String[] args) {
        @SuppressWarnings("unused") int catCount = 0;


        Kote cat1 = new Kote();
        cat1.setCat("Musya", 45, "Zureta",  5, 9, "miauz");

        catCount++;

        Kote cat2 = new Kote("Bars", 40, "Lena", 4, 9, "mu-mu");

        catCount++;

        boolean equal = cat2.equals(cat1);

        System.out.println("Один день из жизни кошки");

        cat1.liveAnotherDay();

        System.out.println("Тоже самое для кошки 2");

        cat2.liveAnotherDay();

        System.out.println("Количество кошек: " + catCount);

        String name = cat1.getName();
        int getWeight = cat1.getWeight();

        System.out.println(name + " " + getWeight);


    }
}
