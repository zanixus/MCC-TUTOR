/**                                                       @version 1.0
   @author Kevin M. Mallgrave
           Professor Janet Brown-Sederberg
           CTIM-157 B02
   @since  4 December 2018
 
   conversion methods for base10 to hex, octal, binary
      
   Version 1.0: initial release
     
 */

import java.util.Scanner;
public class ConversionMethods_KMM
{

public static void main(String[] args)
   {//begin main program
   //System.out.println(convertBase10ToBinary(256));
   System.out.println(convertBase10ToHex(255));
   System.out.println(stego("01100001001100010110000100110001", 7));
   System.out.println(stego("01100001001100010110000100110001", 6, 7));
   }//end main
   
public static String convertBase10ToHex(int n)
   {//accepts an int and returns the hexadecimal representation of the number as a String
   //the String returned must have a length that is a multiple of 8
   //so you must pad the String returned with leading 0�s as necessary
   String hex = "";
   int hexNumber = 0;
   while (n > 0)
   {
      hexNumber = n % 16;
      n = n / 16;                
      switch (hexNumber)
      {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
         hex = hexNumber + hex;
         break;
      case 10:
         hex = 'A' + hex;
         break;
      case 11:
         hex = 'B' + hex;
         break;
      case 12:
         hex = 'C' + hex;
         break;
      case 13:
         hex = 'D' + hex;
         break;
      case 14:
         hex = 'E' + hex;
         break;
      case 15:
         hex = 'F' + hex;
         break;
      default:
         hex = "oh dear" + hex;
         break;    
      }
   }
   for (int i = 0; i < hex.length() % 8; i++)//int >255 16 bit, int >65535 32 bit
   {
   hex = "0" + hex;
   }
   return hex;
   }//end method
   
public static String convertBase10ToOctal(int n)
   {
   //accepts an int and returns the octal representation of the number as a String
   //the String returned must have a length that is a multiple of 8
   //so you must pad the String returned with leading 0�s as necessary
   String octal = "";
   while (n > 0)
   {
      octal = n % 8 + octal;
      n = n / 8;
   }
   for (int i = 0; i < octal.length() % 8; i++)//int >255 16 bit, int >65535 32 bit
   {
   octal = "0" + octal;
   }
   return octal;
   }//end method
   
public static String convertBase10ToBinary(int n)
   {//accepts an int and returns the octal representation of the number as a String
   //the String returned must have a length that is a multiple of 8
   //so you must pad the String returned with leading 0�s as necessary
   String binary = "";
   while (n > 0)
   {
      binary = n % 2 + binary; //mod n %2, add to string "binary"
      n = n / 2;
   }
   for (int i = 0; i < binary.length() % 8; i++)//int >255 16 bit, int >65535 32 bit
   {
   binary = "0" + binary;
   }
   return binary;
   }//end method
   
public static int hash(String s)
   {//accepts a String and returns the total of the ASCII values of all the characters in the String
   int sum = 0;
   for (int i = 0; i < s.length(); i++)
   {
   sum = sum + (int)s.charAt(i);
   }
   return sum;
   }//end method
   
public static String stego(String s, int i)
   {
   String stegoString = ""; //string builder base
   String part = "";
   while (s.length() > i)
   {
   part = s.substring(0, i + 1); //find 0th to i +1 as a new string
   stegoString = stegoString + part.charAt(i);//add found string "chunk" to output
   s = s.substring(i + 1);
   }
   return stegoString;
   }//end method
   
public static String stego(String s, int i, int j)
   {
   String stegoString = ""; //string builder base
   String part = "";
   while (s.length() > i)
   {
   part = s.substring(0, i + 2); //find 0th to i +1 as a new string
   stegoString = stegoString + part.charAt(i) + part.charAt(j);//add found string "chunk" to output
   s = s.substring(i + 2);
   }
   return stegoString;
   }//end method

}//end class