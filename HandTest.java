import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Hand hand;
  Card card;

  @Before
  public void before(){
    hand = new Hand();
    card = new Card(Suit.HEARTS, 1);
  }

  @Test
  public void handHasCard() {
    hand.addCard(card);
    assertEquals(1, hand.getHandSize());
  } 


}