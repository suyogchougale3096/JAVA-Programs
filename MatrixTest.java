import java.util.*;
class Matrix
 {
  static int row,col;
  public static void Input()
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    row = sc.nextInt();
    System.out.print("\nEnter the number of columns : ");
    col = sc.nextInt();
   }
  
  public static void Display()
   {
    System.out.println("Number of rows : " + row);
    System.out.println("Number of rows : " + col);
   }

  public static void display(int a1[][])
   {
    System.out.println("Display matrix : ");
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        System.out.print(a1[i][j] + " ");
       }
      System.out.println();
     }
   }
  
  public static void add(int a1[][],int a2[][])
   {
    System.out.println("Addition");
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        System.out.print(a1[i][j] + a2[i][j] + " ");
       }
      System.out.println();
     }
   }
  
  public static void sub(int a1[][],int a2[][])
   {
    System.out.println("Substraction");
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        System.out.print(a1[i][j] - a2[i][j] + " ");
       }
      System.out.println();
     }
   }
  public static void multi(int a1[][],int a2[][])
   {
    int a3[][] = new int[row][col];
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        a3[i][j] = 0;
        for(int k = 0; k < row; k++)
         {
          a3[i][j] += a1[i][k] * a2[k][j];
         }
       }
     }
    System.out.println("Output of the Multiplication matrix\n");
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        System.out.print(a3[i][j]+" ");
       }
      System.out.println();
     }
   }
  public static void transpose(int a1[][])
   {
    System.out.println("Tanspose of matrix : ");
    for(int i = 0; i < row; i++)
     {
      for(int j = 0; j < col; j++)
       {
        System.out.print(a1[j][i] + " ");
       }
      System.out.println();
     }
   }

  boolean isScalarMatrix(int mat[][])
  {
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            if ((i != j) && (mat[i][j] != 0))
                return false;
 
    for (int i = 0; i < row - 1; i++)
        if (mat[i][i] != mat[i + 1][i + 1])
            return false;
    return true;
  }
  
 }

class MatrixTest
 {
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    Matrix m = new Matrix();
    m.Input();
    m.Display();   

    int a1[][] = new int[m.row][m.col];
    int a2[][] = new int[m.row][m.col];

    System.out.println("Enter the values for first matrix : ");
    for(int i = 0; i < m.row; i++)
     {
      for(int j = 0; j < m.col; j++)
       {
        a1[i][j] = sc.nextInt();
       }
     }
    System.out.println("Enter the values for second matrix : ");
    for(int i = 0; i < m.row; i++)
     {
      for(int j = 0; j < m.col; j++)
       {
        a2[i][j] = sc.nextInt();
       }
     }
    m.display(a1);
    m.display(a2);
    m.add(a1,a2);
    m.sub(a1,a2);
    m.multi(a1,a2);
    m.transpose(a1);
    if (m.isScalarMatrix(a1))
        System.out.println("Yes");
    else
        System.out.println("No");
   }
 }