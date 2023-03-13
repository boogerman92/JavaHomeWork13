import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TicketRepositoryTest {

    TicketRepository repo = new TicketRepository();

    Ticket ticket1 = new Ticket(1, "MSK", "SPB", 100, 90);
    Ticket ticket2 = new Ticket(2, "MSK", "SPB", 50, 150);
    Ticket ticket3 = new Ticket(3, "MSK", "DXB", 500, 400);
    Ticket ticket4 = new Ticket(4, "MSK", "SPB", 10, 15);
    Ticket ticket5 = new Ticket(5, "IST", "TBS", 115, 120);

    @Test
    public void shouldAddTicketNull() {
        Ticket[] expected = {};
        Ticket[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveToId() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.remove(ticket2.getId());

        Ticket[] expected = {ticket1, ticket3, ticket4, ticket5};
        Ticket[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
