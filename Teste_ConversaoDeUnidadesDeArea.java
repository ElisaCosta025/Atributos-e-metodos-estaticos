import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Test;

@DisplayName("Classe para teste de conversão de unidades")
public class Teste_ConversaoDeUnidadesDeArea {
    @Test
    public void Conversao_Test(){
        double x = ConversaoDeUnidadesDeArea.Metro_Para_Pe(8250);
        double y = ConversaoDeUnidadesDeArea.Pe_Para_Acre(x);
        double z = ConversaoDeUnidadesDeArea.Pe_Para_Cm(x);
        Assertions.assertEquals(z, 8.246733E7);
    }
}