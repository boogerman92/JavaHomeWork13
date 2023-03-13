import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TicketTest {

    @Test
    public void shouldSetTicket() {
        Ticket ticket = new Ticket(1, "MSK", "SPB", 100, 90);
        ticket.setId(1);
        ticket.setFrom("MSK");
        ticket.setTo("SPB");
        ticket.setPrice(100);
        ticket.setDuration(90);

        int expectedId = 1;
        int actualId = ticket.getId();
        String expectedFrom = "MSK";
        String actualFrom = ticket.getFrom();
        String expectedTo = "SPB";
        String actualTo = ticket.getTo();
        int expectedPrice = 100;
        int actualPrice = ticket.getPrice();
        int expectedDuration = 90;
        int actualDuration = ticket.getDuration();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedFrom, actualFrom);
        Assertions.assertEquals(expectedTo, actualTo);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedDuration, actualDuration);

    }

}
