import static org.junit.Assert.*;
import org.junit.*;

public class DealerTest {
  Dealer dealer;

  @Before
  public void before(){
    dealer = new Dealer("MoneyPenny");
  }


  @Test
  public void canGetName() {
    assertEquals("MoneyPenny", dealer.getName());
  }

}