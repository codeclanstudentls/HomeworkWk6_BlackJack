import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card(Suit.HEARTS, Rank.TWO);
  }


  @Test
  public void hasSuit() {
    assertEquals(Suit.HEARTS, card.getSuit());
  }

  @Test
  public void hasValue() {
    assertEquals(Rank.TWO, card.getRank());
  }

}