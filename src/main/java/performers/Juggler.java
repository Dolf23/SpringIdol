package performers;

import exceptions.PerformanceException;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("JUGGLER " + beanBags + " BEANBAGS.");
    }
}