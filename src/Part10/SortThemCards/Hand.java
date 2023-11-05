package Part10.SortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;
    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
       this.cards.add((card));
    }
    public void print() {
        this.cards.stream().forEach(System.out::println);

    }

    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = this.cards.stream()
                .map(s ->s.getValue())
                .reduce(0, (prev, value) -> prev + value);

        int handValue = hand.cards.stream()
                .map(s ->s.getValue())
                .reduce(0, (prev, value) -> prev + value);

        return thisValue- handValue;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
