import java.io.*;
public class Main
{
  public static void main(String[] args)throws IOException 
  {
     DataInputStream d= new DataInputStream(System.in);
     System.out.print("Enter the no.of.rows=");
     int r = Integer.parseInt(d.readLine());
    for (int i = 1; i <= r; ++i) 
    {
      for (int j = 1; j <= i; ++j)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
