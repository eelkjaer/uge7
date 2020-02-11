class Fractions {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Arbejde med variabler og aritmetik
     * (2.4 og 2.5) og afrundingsproblemer
     *
     * OPGAVE:
     * 1)
     * Brøkregning
     * Nedenfor er der noget kode der giver flg output:
     * "Brøken 1/3 giver som decimaltal: 0.3333333333333333"
     * Ændre koden så der kommer flg output:
     * "Brøken 1/7 giver som decimaltal: 0.14285714285714285"
     * "Brøken 1/10 giver som decimaltal: 0.1"
     *
     * 2)
     * læg decimaltallet sammen 10 gange, gem det i en variabel og udskriv variablen:
     * System.out.println("...<din sum variabel>....")
     *
     * 3)
     * gang decimaltallet med 10, gem det i en variabel og udskriv variablen:
     * System.out.println("...<din product variabel>....")
     *
     */

    double tæller, nævner, sum, brøk;
    int nummer = 10;


     //Brøk: 1/3
     tæller = 1.0;
     nævner = 3.0;
     brøk = tæller/nævner;
     sum = brøk + nummer; //Plus
     System.out.println("Brøken " + (int)tæller + "/" + (int)nævner + " giver som decimaltal: " + brøk); 
     System.out.println("Decimal " + brøk + " plus " + nummer + " giver: " + sum);
     sum = brøk * nummer;
     System.out.println("Decimal " + brøk + " gange " + nummer + " giver: " + sum + "\n");


     //Brøk: 1/7
     tæller = 1.0;
     nævner = 7.0;
     brøk = tæller/nævner;
     sum = brøk + nummer; //Plus
     System.out.println("Brøken " + (int)tæller + "/" + (int)nævner + " giver som decimaltal: " + brøk); 
     System.out.println("Decimal " + brøk + " plus " + nummer + " giver: " + sum);
     sum = brøk * nummer;
     System.out.println("Decimal " + brøk + " gange " + nummer + " giver: " + sum + "\n");

     //Brøk: 1/10
     tæller = 1.0;
     nævner = 10.0;
     brøk = tæller/nævner;
     sum = brøk + nummer; //Plus
     System.out.println("Brøken " + (int)tæller + "/" + (int)nævner + " giver som decimaltal: " + brøk); 
     System.out.println("Decimal " + brøk + " plus " + nummer + " giver: " + sum);
     sum = brøk * nummer;
     System.out.println("Decimal " + brøk + " gange " + nummer + " giver: " + sum + "\n");

  }
}
