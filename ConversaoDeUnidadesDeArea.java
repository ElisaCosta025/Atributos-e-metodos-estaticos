// Classe de conversão de medidas
class ConversaoDeUnidadesDeArea {

	// Conversão metro-pé e vice versa
  public static double Metro_Para_Pe(double m) {
    return(m*10.76);
  }
	public static double Pe_Para_Metro(double p) {
    return(p/10.76);
  }

	// Conversão pé-centimetro e vice versa
	public static double Pe_Para_Cm(double p) {
    return(p*929);
  }
	public static double Cm_Para_Pe(double c) {
    return(c/929);
  }

	// Conversão acre-pé e vice versa
	public static double Acre_Para_Pe(double a) {
    return(a*43.560);
  }
	public static double Pe_Para_Acre(double p) {
    return(p/43.560);
  }
	
	// Conversão milha-acre e vice versa
	public static double Milha_Para_Acre(double mi) {
    return(mi*640);
  }
	public static double Acre_Para_Milha(double a) {
    return(a/640);
  }
	
}