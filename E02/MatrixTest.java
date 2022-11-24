import java.util.Scanner;
class Matrix
 {
    int row,col;

    void input()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        col = sc.nextInt();
     }
    int[][] arrayInput()
     {
        int temp1[][] = new int[row][col];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                temp1[i][j] = sc.nextInt();
            }
        }
        return temp1;
     }

    void arrayDisplay(int[][] t1)
    {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(t1[i][j] + " ");
            }
            System.out.println();
        }
    }

    void addition(int[][] temp1,int[][] temp2)
     {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(temp1[i][j] + temp2[i][j] + " ");
            }
            System.out.println();
        }
     }

    void substraction(int[][] temp1,int[][] temp2)
     {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(temp1[i][j] - temp2[i][j] + " ");
            }
            System.out.println();
        }
     }

    void multiplication(int[][] temp1,int[][] temp2)
     {
        int[][] c = new int[row][col];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                c[i][j] = 0;

                for(int k =0; k < row; k++)
                {
                    c[i][j] += temp1[i][k] * temp2[k][j];
                }
            }
        }
        arrayDisplay(c);
     }

    void transpose(int[][] temp1)
     {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(temp1[j][i] + " ");
            }
            System.out.println();
        }
     }

    void scalermatrix(int[][] temp1)
     {
        int temp[][] = new int[row][col];
        Scanner sc = new Scanner(System.in);
        int scaler = 0;
        System.out.println("Enter the value of scaler : ");
        scaler = sc.nextInt();

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                temp[i][j] = temp1[i][j] * scaler;
            }
        }
        System.out.println("\n\n");
        arrayDisplay(temp);
     }
 }

 class MatrixTest
  {
    public static void main(String args[])
     {
        int choice;
        Matrix m = new Matrix();
        Scanner sc = new Scanner(System.in);
        m.input();
        int[][] a = new int[m.row][m.col];
        int[][] b = new int[m.row][m.col];
        System.out.println("Enter the elements for the first matrix : ");
        a = m.arrayInput();
        System.out.println("Enter the elements for the second matrix : ");
        b = m.arrayInput();

        while(true)
        {
         System.out.println("\nMenu.\n1.Addition\n2.Substraction\n3.Multiplication\n4.Scaler multiplication\n5.transpose.\n6.display\n7.exit");

         System.out.println("\nEnter the choice : ");
         choice = sc.nextInt();

         switch(choice)
         {
            case 1:
                    System.out.println("Addition is : ");
                    m.addition(a,b);
                    break;
            case 2:
                    System.out.println("Substraction is : ");
                    m.substraction(a,b);
                    break;
            case 3:
                    System.out.println("Multiplication is : ");
                    m.multiplication(a,b);
                    break;
            case 4:
                    System.out.println("The scaler multiplication for 1st array : ");
                    m.scalermatrix(a);
                    System.out.println("The scaler multiplication for 2nd array : ");
                    m.scalermatrix(b);
                    break;
            case 5:
                    System.out.println("Transpose for first matrix : ");
                    m.transpose(a);
                    System.out.println("Transpose for second matrix : ");
                    m.transpose(b);
                    break;
            case 6:
                    System.out.println("The first matrix : ");
                    m.arrayDisplay(a);
                    System.out.println("The second matrix : ");
                    m.arrayDisplay(b);
                    break;
            case 7:
                    System.exit(0);
                    break;
            default:
         }
        }
     }
  }