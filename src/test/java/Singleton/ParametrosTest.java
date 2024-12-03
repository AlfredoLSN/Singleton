package Singleton;

import org.example.Parametros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ParametrosTest {
    @Test
    public void deveRetornarNomeMercado(){
        Parametros.getInstance().setNomeMercado("Mercadao do Juarez");
        assertEquals("Mercadao do Juarez", Parametros.getInstance().getNomeMercado());
    }
    @Test
    public void deveRetornarQntCaixas(){
        Parametros.getInstance().setQntCaixas(5);
        assertEquals(5, Parametros.getInstance().getQntCaixas());
    }
}
