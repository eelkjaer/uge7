class Kurt {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Arbejde med 2.9 Kompiler fejl
     *
     * OPGAVE:
     * 1)
     * Få tilrettet denne fil så den kan kompilere
     * og udskrive flg: 
     * "Hej Verden"
     * "Det bliver mega hyggeligt."
     * "Jeg begynder med T og er 10 år gammel"
     *
     */
    String myLetter = "T"; //Ændret til String fremfor Char. Hvis typen er Char skal '' benyttes fremfor ""
    int myAge = 10;
    System.out.println("Hej Verden");
    System.out.println("Det bliver mega hyggeligt.");
    System.out.println("Jeg begynder med " + myLetter + " og er " + myAge + " år gammel");
  }
}
