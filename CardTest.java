import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card(Suit.HEARTS, 1);
  }


  @Test
  public void hasSuit() {
    assertEquals(Suit.HEARTS, card.getSuit());
  }

  @Test
  public void hasValue() {
    assertEquals(1, card.getValue());
  }

}