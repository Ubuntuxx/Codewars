public class Kata {
    public static int howOld(final String herOld) {
        String number = String.valueOf(herOld.charAt(0));
        int valor = Integer.parseInt(number);
        return valor;
    }


    /*Other solutions
     * public class CharProblem {
     *  public static int howOld(final String herOld) {
     *  return Character.getNumericValue(herOld.charAt(0));
  }
}
     */
}
