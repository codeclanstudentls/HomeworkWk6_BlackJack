import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Hand hand;
  Card card;

  @Before
  public void before(){
    hand = new Hand();
    card = new Card(Suit.HEARTS, Rank.TWO);
  }

  @Test
  public void handHasCard() {
    hand.addCard(card);
    assertEquals(1, hand.getHandSize());
  } 

  // @Test
  // public void handHasAnotherCard() {
  //   hand.addCard(card);
  //   assertEquals(2, hand.getHandSize());
  // }


}