/*
*	Author: Prof Brown-Sederberg
*	Description: This class represents a playing card
*	Date Last Revision: 6.15.2018
*/

public class Card
{
  //instance variables
  private String suit;
  private String face;
  private int value;
  private boolean shuffled;
  private boolean dealt;
  
  //constructors
  public Card()
  {
   suit = "";
   face = "";
   value = 0;
   shuffled = false;
   dealt = false;
  }//end default constructor
  
  public Card(String suitPassed, String facePassed,
              int valuePassed, boolean shuffledPassed,
              boolean dealtPassed)
  {
    suit = suitPassed;
    face = facePassed;
    value = valuePassed;
    shuffled = shuffledPassed;
    dealt = dealtPassed;
  }//end constructor method
  
  //getters
  public String getSuit()
  {
   return suit; 
  }//end getSuit
  
  public String getFace()
  {
  return face;  
  }//end getFace
  
  public int getValue()
  {
    return value;
  }//end getValue
  
  public boolean getShuffled()
  {
  return shuffled;  
  }//end getShuffled
  
  public boolean getDealt()
  {
  return dealt;  
  }//end getDealt
  
  //setter methods
  public void setSuit(String suitPassed)
  {
  suit = suitPassed;  
  }//end setSuit
  
  public void setFace(String facePassed)
  {
  face = facePassed;  
  }//end setFace
  
  public void setValue(int valuePassed)
  {
   value = valuePassed; 
  }//end setValue
  
  public void setShuffled(boolean shuffledPassed)
  {
  shuffled = shuffledPassed;  
  }//end setShuffled
  
  public void setDealt(boolean dealtPassed)
  {
    dealt = dealtPassed;
  }//end setDealt

  public String toString()
{
	return "Suit: " + suit + "\nFace: " + face + "\nValue: " + value + "\nShuffled: " + shuffled + "\nDealt: " + dealt; 
}
   
}//end class card