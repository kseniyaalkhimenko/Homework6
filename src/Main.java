public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Reks", 450, 5);
        Dog dog2 = new Dog("Bobik", 600, 11);
        Cat cat1 = new Cat("Myrka", 210, 5);
        Cat cat2 = new Cat("Barsik", 50, 0);

        dog1.Running();
        dog1.Swimming();
        System.out.println();

        dog2.Running();
        dog2.Swimming();
        System.out.println();

        cat1.Running();
        cat1.Swimming();
        System.out.println();

        cat2.Running();
        cat2.Swimming();

        int counterAnimals = 0;
        int counterCat = 0;
        int counterDog = 0;

        Animals a[] = {dog1, dog2, cat1, cat2};

        for (Animals anim: a) {

            if (anim instanceof Animals){
                counterAnimals++;
            }
            if (anim instanceof  Dog){
                counterDog++;
            }
            if (anim instanceof Cat){
                counterCat++;
            }
        }

        System.out.println();
        System.out.println("CAT count is " + counterCat + ", DOG count is " + counterDog + ", total ANIMAL count is " + counterAnimals + ".");

    }

}
