package tictactoe;
import java.util.Scanner;
public class TicTacToe {
public static void main(String[] args) {
int num=1;
int arr[][]=new int[3][3];
char arr2[][]=new char [3][3];
System.out.println("Lets play");

for(int row=0;row<arr.length;row++)
{
for(int col=0;col<arr[row].length;col++)
{
arr[row][col]=num;
System.out.print(arr[row][col]+"   ");
num++;
}
System.out.println("");
}
Scanner input = new Scanner( System.in);
int a;
for(int x=0;x<9;x++){

switch(x){
case 0:
case 2:
case 4:
case 6:
case 8:
System.out.println("Enter Player X move");
a=input.nextInt(); 

for(int b=0;b<3;b++)
{
for(int c=0;c<3;c++)
{
if(arr[b][c]==a)
{
arr[b][c]='X';
arr2[b][c]=(char)arr[b][c];

System.out.print(arr2[b][c]+"   ");
}
else if(arr[b][c]!=a && arr[b][c]==arr2[b][c])
{
System.out.print(arr2[b][c]+"   ");
}

else
{
System.out.print(arr[b][c]+"   ");
}
}
System.out.println("");
}        
break; 

//--------------------------------------------------------------------------
case 1:
case 3:
case 5:
case 7:
System.out.println("Enter Player O move");    
a=input.nextInt();
for(int b=0;b<3;b++)
{
for(int c=0;c<3;c++)
{
if(arr[b][c]==a)
{
arr[b][c]='O';
arr2[b][c]=(char)arr[b][c];

System.out.print(arr2[b][c]+"   ");
}
else if(arr[b][c]!=a && arr[b][c]==arr2[b][c])
{
System.out.print(arr2[b][c]+"   ");
}

else
{
System.out.print(arr[b][c]+"   ");
}
}
System.out.println("");
}
break;
}
if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]=='X'){System.out.println("Player X win");break;}
if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2] && arr[1][0]=='X'){System.out.println("Player X win");break;}
if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2] && arr[2][0]=='X'){System.out.println("Player X win");break;}
if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0] && arr[0][0]=='X'){System.out.println("Player X win");break;}
if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1] && arr[0][1]=='X'){System.out.println("Player X win");break;}
if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2] && arr[0][2]=='X'){System.out.println("Player X win");break;}
if(arr[0][0]==arr[0][1] && arr[0][0]==arr[0][2] && arr[0][0]=='O'){System.out.println("Player O win");break;}
if(arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2] && arr[1][0]=='O'){System.out.println("Player O win");break;}
if(arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2] && arr[2][0]=='O'){System.out.println("Player O win");break;}
if(arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0] && arr[0][0]=='O'){System.out.println("Player O win");break;}
if(arr[0][1]==arr[1][1] && arr[0][1]==arr[2][1] && arr[0][1]=='O'){System.out.println("Player O win");break;}
if(arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2] && arr[0][2]=='O'){System.out.println("Player O win");break;}
}
}
}  
//----------------------------------------------------------------------------------------------------------