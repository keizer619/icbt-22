/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilaal
 */
public class HelloWorld 
{
    public static void main(String[] args)
    {
        System.out.println("Hellow World!!!");
        {
          int limit = 4;
            for ( int x = 0; x < limit; x++  )
            {
              for ( int y = 0; y < limit; y++ )
                {
                    System.out.print("* ");
                }
               System.out.println();
            }
        }   
    }          
}