/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolates;

/*********************************************************************
 **************   MOVE THROUGH A TWO DIMENSIONAL ARRAY   *************
 **************          SUM THE MAX VALUES              *************
 ********************************************************************/
import java.util.Scanner;
public class Chocolates {
//double value = 0;

public static void main(String[] args){
 Scanner input = new Scanner(System.in);
   
 int[][] m = {
     {0,0,0,0,0,0,0},
     {0,6,8,9,7,4,0},
     {0,0,0,8,0,5,0},
     {0,5,7,4,5,10,0},
     {0,4,2,0,6,9,0},
     {0,0,0,0,0,0,0}
    };

 int sum = 8; // 8 is the starting value
 
 // Begin Search from Center Location in Array.
 int row_C = 2; // Row of Center Value to be Compared.
 int collumn_C = 3; // Collumn of Center Value to be compared.
 int MaxValue = 0; // Temp Variable for Max Value of Surrounding Elements.

 // Compare Center Value to Surrounding Elements; Up, Down, Left, Right.
 int y = 0; // Row (y-coordianate) of Element Compared to center value.
 int x = 0; // Collumn (x-coordinate) of Element Compared to center value.

 
/********************************************************************
 WHILE ALL THE SURROUNDING ELEMENTS ARE NOT ZERO, SUM THE MAX VALUES
********************************************************************/ 
 
while(m[row_C][collumn_C - 1]
        + m[row_C][collumn_C + 1]
        + m[row_C - 1][collumn_C]
        + m[row_C + 1][collumn_C] != 0){

MaxValue = 0; // Set MaxValue back to zero.
      
/********************************************************
**********COMPARE ELEMENT LEFT OF CENTER**************
********************************************************/ 

y = row_C;
x = collumn_C - 1;
if(m[y][x] >  MaxValue){
MaxValue = m[y][x];
row_C = y;
collumn_C = x;
};
m[y][x] = 0;

/********************************************************
**********COMPARE ELEMENT ABOVE CENTER**************
********************************************************/ 

y = y - 1;
x = x + 1;
if(m[y][x] > MaxValue){
MaxValue = m[y][x];
row_C = y;
collumn_C = x;
};
m[y][x] = 0;


/********************************************************
**********COMPARE ELEMENT RIGHT OF CENTER**************
********************************************************/ 

y = y + 1;
x = x + 1;
if(m[y][x] > MaxValue){
MaxValue = m[y][x];
row_C = y;
collumn_C = x;
};
m[y][x] = 0;


/********************************************************
**********COMPARE ELEMENT BELOW CENTER**************
********************************************************/ 

y = y + 1;
x = x - 1;
if(m[y][x] > MaxValue){
MaxValue = m[y][x];
row_C = y;
collumn_C = x;
};
m[y][x] = 0;
// End Search of Surrounding Elements.

/***********************************************************
****      ADD MAX VALUE FOUND TO THE TOTAL SUM      ********
***********************************************************/

System.out.print(MaxValue);
System.out.print(" ");
System.out.print(m[row_C][collumn_C]);

sum += MaxValue;
System.out.println(sum);
System.out.println("\n");
/*return h;*/
}
};
};
