package oop_design.deck_of_cards;

import java.util.ArrayList;

public class Deck <T extends Card>{
    private ArrayList<T> cards;
    private int dealtIndex = 0;

    public void setDeckOfCards(ArrayList<T> deckOfCards){
        cards.addAll(deckOfCards);
    }
    public void schuffle(){}
    public int remainingCards(){
        return cards.size() - dealtIndex;
    }
}
