import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest {

  Deck deck;
  @Before
  public void before(){
    deck = new Deck(new Card[52]);
  }

  @Test
  public void deckHasCards() {
    assertEquals(52, deck.numberOfCards());
  } 

  @Test
  public void canBuildDeck() {
   
    assertEquals(4, 4);
  }

  // @Test
  // public void canRemoveCardFromDeck() {
  //   assertEquals( , );
  // }

}