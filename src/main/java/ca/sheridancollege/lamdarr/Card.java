package ca.sheridancollege.lamdarr;

public class Card implements CardInterface {
    private int rank;
    private String suit;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public void displayCard(){
        System.out.println("Rank: " + this.rank + ", Suit: " + this.suit);
    }
}
