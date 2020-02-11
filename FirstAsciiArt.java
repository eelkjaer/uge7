class FirstAsciiArt {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output
     *
     * OPGAVEN:
     * 1)Find ud af hvor lang tabulator-karakteren er
     * 2)Tegn flg figur vha \t, | og #:
     *
*|								|
*|				   #   				|
*|				  ###  				|
*|				 ##### 				|
*|				#######				|
*|		41.    6	       #########     			|
*|			      ############   			|
     *
     */ 


    String line;
    line = "|\t\t\t\t\t|"
    + "\n|\t\t      #      \t\t|"
    + "\n|\t\t     ###     \t\t|"
    + "\n|\t\t    #####    \t\t|"
    + "\n|\t\t   #######   \t\t|"
    + "\n|\t\t  #########  \t\t|"
    + "\n|\t\t ########### \t\t|"
    + "\n|\t\t#############\t\t|"
    + "\n|_____________________"
    + "__________________|"
    + "\n| En tabulator er ca. 6 karakterer lang\t|"
    + "\n|_____________________"
    + "__________________|";
    
    System.out.println(line);
  }
}
