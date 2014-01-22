package taojava.lab.codereading;

/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class Main 
{
  /**
   * Print some not-very-interesting output.
   */
  public static void 
    main (String[] args) 
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
    for (int i = 0; i < 5; i++) 
      {
        pen.println (i + " squared is " + MathUtils.square (i));
      } // for
    for (double x = 1; x < 10; x++)
      {
        pen.println (x/10 + " squared is " + MathUtils.square (x/10));
      } //for
    pen.close ();
  } // main(String[])
} // class Main
