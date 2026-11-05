import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaClienteTest {
    @Test
    public void testOperacoesDeSaldo() {
        Cliente c = new Cliente(2, "Pedro", 0, "m");
        ContaCliente conta = new ContaCliente(10, c, 100.0);
        
        assertEquals(150.0, conta.addDeposito(50.0));
        assertEquals(100.0, conta.subSaldo(50.0));
        assertEquals(100.0, conta.subSaldo(200.0)); // Não deve permitir saldo negativo
        assertEquals("Pedro (2) saldo=R$100.0", conta.toString());
    }
}