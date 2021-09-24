class Main {
  public static void main(String[] args) {
    double x = ConversaoDeUnidadesDeArea.Metro_Para_Pe(8250);
		double y = ConversaoDeUnidadesDeArea.Pe_Para_Acre(x);
		double z = ConversaoDeUnidadesDeArea.Pe_Para_Cm(x);
		System.out.println("Em pés: "+ x +" Em Acres: "+ y +" Em cm: "+ z);
  }
}
