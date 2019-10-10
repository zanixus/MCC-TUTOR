import java.util.Random;

public class Seat
{
private int row;
private int seat;
private boolean aisle;
private boolean window;
private boolean occupied;
private int cost;
private static int revenue = 0;

public Seat()
{
row = 0;
seat = 0;
aisle = false;
window = false;
occupied = false;
cost = 0;
}//end constructor

public Seat(int rowPassed, int seatPassed)
{
Random randNumGen = new Random();
row = rowPassed;
seat = seatPassed;
if(seatPassed == 1 || seatPassed == 2)
	aisle = true;
	else
	aisle = false;
if(seatPassed == 0 || seatPassed == 3)
	window = true;
	else
	window = false;
occupied = false;
cost = randNumGen.nextInt(301) + 200;
//revenue = revenue + cost;
}//end constructor

//getters
public int getRow()
{
return row;
}//end method getRow

public int getSeat()
{
return seat;
}//end method getSeat

public boolean getAisle()
{
return aisle;
}//end method getAisle

public boolean getWindow()
{
return window;
}//end method getWindow

public boolean getOccupied()
{
return occupied;
}//end method getOccupied

public int getCost()
{
return cost;
}//end method getCost

public static int getRevenue()
{
return revenue;
}//end method getRevenue

//////
//setters
public void setRow(int rowPassed)
{
row = rowPassed;
}//end method setRow

public void setSeat(int seatPassed)
{
seat = seatPassed;
}//end method setSeat

public void setAisle(boolean aislePassed)
{
aisle = aislePassed;
}//end method setAisle

public void setWindow(boolean windowPassed)
{
window = windowPassed;
}//end method setWindow

public void setOccupied(boolean occupiedPassed)//Revised to take care of gaming the system
{
	if(occupiedPassed == true && occupied == false)//unoccupied becomes occupied
	{
		occupied = occupiedPassed;
		revenue = revenue + cost;
	}
	else if (occupiedPassed == false && occupied == true) //occupied becomes unoccupied
		{
				occupied = occupiedPassed;
				revenue = revenue - cost;
		}
	//no need to deal with occupied become occupied or 
	//unoccupied becomes unoccupied as no change in status 
	//of seat and renevue
}//end method setOccupied

public void setCost(int costPassed)
{
cost = costPassed;
}//end method setCost

public String toString()
{
return
"Row: " + row + "\n" + 
"Seat: " + seat + "\n" + 
"Aisle: " + aisle + "\n" + 
"Window: " + window + "\n" + 
"Occupied: " + occupied + "\n" + 
"Cost: $" + cost + "\n";
}//end toString

}//end class
