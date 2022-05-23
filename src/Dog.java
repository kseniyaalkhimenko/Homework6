public class Dog extends Animals {

  public Dog(String name, int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;
        this.name = name;
    }

    public void Running() {

        if (distRun >= 500) {
            System.out.println("You asked dog " + getName() + " to run " + distRun +  " meters. But dog can't run more than 500 meters.");
        } else {
            System.out.println("You asked dog " + getName() + " to run " + distRun + " meters. Dog ran " + distRun + " meters.");
        }

    }

    public void Swimming() {
        if (distSwim >= 10) {
            System.out.println("You asked dog " + getName() + " to swim " + distSwim +  " meters. But dog can't swim more than 10 meters.");
        } else {
            System.out.println("You asked dog " + getName() + " to swim " + distSwim + " meters. Dog swam " + distSwim + " meters.");
        }
    }


}
