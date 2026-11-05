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
    
    @Test
    public void testValorComDescontoEToString() {
        Cliente c = new Cliente(1, "Maria", 20, "f");
        FaturaCliente fatura = new FaturaCliente(100, c, 50.0);
        assertEquals(40.0, fatura.getValorComDesconto());
        assertEquals("Fatura [id=100 cliente Maria (1) (20%), valor=50.0]", fatura.toString());
    }
}