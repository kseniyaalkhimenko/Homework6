public class Cat extends Animals {

   public Cat (String name, int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;
        this.name = name;
    }

    public void Running() {

        if (distRun >= 200) {
            System.out.println("You asked cat " + getName() + " to run " + distRun +  " meters. But cat can't run more than 200 meters.");
        } else {
            System.out.println("You asked cat " + getName() + " to run " + distRun + " meters. Cat ran " + distRun + " meters.");
        }

    }

    public void Swimming() {
        if (distSwim > 0) {
            System.out.println("You asked cat to swim " + distSwim +  " meters. But cat can't swim.");
        } else if (distSwim == 0) {
            System.out.println("All right, Cat can't swim.");
        }
    }


}
