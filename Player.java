

public class Player {
  private String name;
  private Hand[] deck;

  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = new Hand[2];
  }

  public String getName() {
    return this.name;
  }

  // public void getHand(?) {
  // this.hand = hand;
  // }
}