import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {
  Player player;

  @Before
  public void before(){
    player = new Player("Andy");
  }


  @Test
  public void canGetName() {
    assertEquals("Andy", player.getName());
  }

}