// import java.util.Random;

public class Deck {
  private Card[] cards;  

  public Deck(Card[] cards) {
    this.cards = cards;

  }

  public Card[] getCards() {
    return this.cards;
  }

  public int numberOfCards() {
    return this.cards.length; 
  }

  public void buildDeck() {
    int i = 0;
    for (Suit suit : Suit.values()){
      for (Rank rank : Rank.values()){
        cards[i]= new Card(suit, rank);
        i++;
      }
    }

     


  }
}