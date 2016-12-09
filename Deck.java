

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
    for (Suit suit : Suit.value()){
      for (Rank rank : Rank.value()){
        Card[]=value (new Card(value, suit));
      }
    }
  }
}