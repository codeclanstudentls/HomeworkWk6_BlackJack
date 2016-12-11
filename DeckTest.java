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
   new_deck_name = new Deck();
   assertEquals(52, new_deck_name.length);
 }

  // @Test
  // public void canRemoveCardFromDeck() {
  //   assertEquals( , );
  // }

}