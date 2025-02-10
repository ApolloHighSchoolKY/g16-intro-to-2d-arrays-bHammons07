import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args)
  {
    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;
   
    //System.out.println(Arrays.toString(ray));
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col < ray[row].length; col++)
      {
        ray[row][col] = (int)(Math.random()*11 + 0);
      }
      System.out.println(Arrays.toString(ray[row]));
    }

    int sum = 0;
    for(int row = 0; row<ray.length; row++)
    {
      sum = 0;

      for(int col = 0; col < ray[row].length; col++)
      {
        
        ray[row][col] = (int)(Math.random()*11 + 0);
        sum += ray[row][col];
      }
      System.out.println("The sum of row " + row + " is: " + sum);
    }

    System.out.println("\n\n\nHomework Assignment");
    //Add up the columns of each row using for each loops...
    
    int total = 0;

    for(int[] row: ray)
    {
      //total = 0;
      for(int col: row)
      {
        total+=col;
      }
      
    }
    System.out.println("The sum of the 2D-array is: " + total);
  }
}
