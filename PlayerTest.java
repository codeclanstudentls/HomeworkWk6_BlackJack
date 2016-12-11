import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {
  Player player;
  Hand hand;

  @Before
  public void before(){
    player = new Player("Andy");
    hand = new Hand(?);
  }


  @Test
  public void canGetName() {
    assertEquals("Andy", player.getName());
  }

  @Test
  public voif canGetHand() {
    assertEquals(bananas, player.getHand());
  }

}