

public class Card {
  private int value;
  private Suit suit;

  public Card(Suit suit, int value) {
    this.value = value;
    this.suit = suit;

  }

  public Suit getSuit() {
    return this.suit;
  }

  public int getValue() {
    return this.value;
  }

}

