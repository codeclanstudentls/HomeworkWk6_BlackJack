

public class Card {
  private Rank rank;
  private Suit suit;

  public Card(Suit suit, Rank rank) {
    this.rank = rank;
    this.suit = suit;

  }

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }

}

