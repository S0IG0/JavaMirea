package Practic_3;

public class Human {
    Head head;
    Leg leg;
    Hand hand;

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leg=" + leg +
                ", hand=" + hand +
                '}';
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
