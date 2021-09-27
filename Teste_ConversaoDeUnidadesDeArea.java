import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Test;

@DisplayName("Classe para teste de conversão de unidades")
public class Teste_ConversaoDeUnidadesDeArea {
    @Test
    public void Conversao_Test_Pe(){
        double x = ConversaoDeUnidadesDeArea.Metro_Para_Pe(8250);
        double y = ConversaoDeUnidadesDeArea.Pe_Para_Acre(x);
        double z = ConversaoDeUnidadesDeArea.Pe_Para_Cm(x);
        Assertions.assertEquals(z, 88770.0);
    }
    @Test
    public void Conversao_Test_Acre(){
        double x = ConversaoDeUnidadesDeArea.Metro_Para_Pe(8250);
        double y = ConversaoDeUnidadesDeArea.Pe_Para_Acre(x);
        double z = ConversaoDeUnidadesDeArea.Pe_Para_Cm(x);
        Assertions.assertEquals(y, 2037.8787878787878);
    }
    @Test
    public void Conversao_Test_cm(){
        double x = ConversaoDeUnidadesDeArea.Metro_Para_Pe(8250);
        double y = ConversaoDeUnidadesDeArea.Pe_Para_Acre(x);
        double z = ConversaoDeUnidadesDeArea.Pe_Para_Cm(x);
        Assertions.assertEquals(z, 8.246733E7);
    }
}
