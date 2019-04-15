import org.junit.Test;
import poo.Telefone;

import static org.junit.Assert.*;

public class testeTelefone {

    @Test
    public void addTelefone(){

        Telefone telefone = new Telefone();

        assertEquals("Erro no addTelefone", true, telefone.add("residencial", "32420369"));
        assertEquals("Erro no addTelefone", false, telefone.add("residencial", "32420369"));
        assertEquals("Erro no addTelefone", true, telefone.add("comercial", "32420399"));
    }


}
