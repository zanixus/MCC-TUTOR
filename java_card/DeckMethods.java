/*
*	Author: Prof Brown-Sederberg
*	Description: This class provides methods to manipulate object of type Card (Card.java)
*	Date Last Revision: 6.15.2018
*/


public class DeckMethods
{
/*
* appends an instance of the class Card to th an array of instances of the class card
* if there is room in hat array 
*/
 public static void appendCard(Card[] deckOfCardsPassed, 
                               Card cardToAppend)
 {
  deckOfCardsPassed[countElements(deckOfCardsPassed)] = cardToAppend;
 }//end method appendCard
 
/*
* returns the number of elements in an array of Cards
* i.e. the number of spaces filled with instances of the class Card
* in the array 
*/
public static int countElements(Card[] deckOfCardsPassed)
 {
  int count = 0;
  for(int i = 0; i < deckOfCardsPassed.length; ++i)
  {
    if(deckOfCardsPassed[i] !=  null)
       ++count;
  }//end loop
  return count; 
 }//end method countElements
 
/*
* returns thefirst card (in position [0] of an aray of Cards
* moves the remaining Cards forward in the array
*/
 public static Card popCard(Card[] deckOfCardsPassed)
 {
   Card cardToBeReturned = deckOfCardsPassed[0];
   for(int i = 1; i < deckOfCardsPassed.length; ++i)
   {
     deckOfCardsPassed[i - 1] = deckOfCardsPassed[i];
   }//end for loop
   
   deckOfCardsPassed[deckOfCardsPassed.length - 1] = null;
   return cardToBeReturned;                 
 }//end popCard
 
/*
* populates and array with nulls
*/
 public static void populateNull(Object[] arrayPassed)
      {
   for(int i = 0; i < arrayPassed.length; ++i)
   {
    arrayPassed[i] = null; 
   }//end for loop
 }//end method populateNull
 
/*
* Divides an array of instances of class Card into two arrays of equal size
*/ 
public static void cutTheDeck(Card[] deckOfCardsPassed,
       Card[] playerDeckPassed, Card[]computerDeckPassed)
 {
  for(int i = 0; i < deckOfCardsPassed.length/2; ++i)
        {
        playerDeckPassed[i] = deckOfCardsPassed[i];
        computerDeckPassed[i] = 
          deckOfCardsPassed[i + deckOfCardsPassed.length/2];
        }//end for loop
 }//end method cutTheDeck
                                 
/*
* Prints the values of the valiables of instances of the class Card
* in an array of Cards
*/ 
public static void printDeck(Card[] deckPassed)
 {
  for(int i = 0; i < deckPassed.length; ++i)
  {
    if(deckPassed[i] != null)
        System.out.println(deckPassed[i].toString()); 
  }//end loop 
 }//end method printDeck
 
/*
* Randomizes the instances of the class Card within an 
* array of instaces of the class Card
*/ 
public static void shuffleDeck(Card[] deckPassed)
 {
  for(int i = 0; i < deckPassed.length; ++i)
  {
   int j = (int)(Math.random() * deckPassed.length);
   Card temp = deckPassed[i];
   deckPassed[i] = deckPassed[j];
   deckPassed[j] = temp;
   deckPassed[i].setShuffled(true);
   deckPassed[j].setShuffled(true);
  }//end for loop
 }//end method shuffleDeck
 
/*
* Creates instances of the class Card and populates an array of instances of the class Card
* with those instances, the array therefore holds 52 instances of the class Card representing an
* ushuffeled deck of cards
*/ 
public static void populateDeck(Card[] deckPassed)
 {
   int position = 0;
   String[] suit = {"Hearts", "Clubs", "Diamonds", "Spades"};
   String[] face = {"Ace", "Two", "Three", "Four", "Five", "Six",
     "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
   int[] value ={1,2,3,4,5,6,7,8,9,10,10,10,10};
   for(int i = 0; i < suit.length; ++i)
   {
     for(int j = 0; j < face.length; ++j)
     {
     deckPassed[position] = new Card(suit[i], face[j], value[j], 
                                     false, false);
     position++;
     }//end inner loop
   }//end outer for loop
   
 }//end method shuffleDeck
  
}//end class