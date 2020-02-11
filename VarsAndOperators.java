class VarsAndOperators {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Arbejde med udskrive variabler og aritmetik
     * (2.4 og 2.5)
     * Opgave 4) og 5) er et par "undringsopgaver" som
     * man kan give sig i kast med hvis man er færdig.
     *
     * OPGAVE:
     * 1)
     * Tildel flg variabler passende typer:
     * kundeNavn = "Kurt Verner"
     * kiloVægt = 75
     * meterHoejde = 1.75
     * gramVægt = <udregnes vha kiloVægt>
     *
     * Udskriv flg. linje:
     * Kære Kurt Verner. Din vægt i kg 75.0 svarer til 75000.0 gram. 
     *
     * 2)
     * Udregn BMI
     * Google formlen for BMI og udskriv flg. linje;
     * Kære Kurt Verner. Din BMI er 24.489795918367346
     *
     * 3)
     * Overvej hvordan du kan få printet følgende istedet (og kun vha kapitel 2)
     * Kære Kurt Verner. Din BMI er 24.489796
     *
     * 
     */

    String kundeNavn;
    int kiloVaegt;
    double meterHoejde, gramVaegt, bmi;

    kundeNavn = "Kurt Verner";
    kiloVaegt = 75;
    meterHoejde = 1.75;
    gramVaegt = kiloVaegt * 1000;
    bmi = (double)kiloVaegt / (meterHoejde*meterHoejde);

    System.out.println("Kære " + kundeNavn + ". Din vægt i kg " + (double)kiloVaegt + " svarer til " + gramVaegt + " gram.");
    System.out.println("Kære " + kundeNavn + ". Din BMI er " + bmi);

    //TODO: Runder ned til 2 decimaler. Ved 6 giver den anderledes værdi.
    bmi = bmi * 100;
    bmi = (int) bmi;
    bmi = bmi / 100;

    System.out.println("Kære " + kundeNavn + ". Din BMI er " + bmi);

  }
}
