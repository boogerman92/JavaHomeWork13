import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TicketManagerTest {

    @Test
    public void testSortTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 100, 90);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 50, 150);
        Ticket ticket3 = new Ticket(3, "MSK", "DXB", 500, 400);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 10, 15);
        Ticket ticket5 = new Ticket(5, "IST", "TBS", 115, 120);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket4, ticket2, ticket1};
        Ticket[] actual = manager.findAll("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }
}