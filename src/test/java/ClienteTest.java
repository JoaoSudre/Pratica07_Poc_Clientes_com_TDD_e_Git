import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    public void testCriacaoEFormatacaoToString() {
        Cliente cliente = new Cliente(1, "Joao", 10, "m");
        assertEquals(1, cliente.getId());
        assertEquals("Joao", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
        assertEquals("m", cliente.getGenero());
        assertEquals("Joao (1) (10%)", cliente.toString());
    }
}