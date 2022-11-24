import java.util.Scanner;
class Stack
 {
  int top;
  int[] arr;
 
  Stack(int size)
   {
    top = -1;
    arr = new int[size];
   }
  int push(int number,int size)
   {
       if(top >= size-1)
       {
              return -1;
       }
       else
       {
              top++;
              arr[top] = number;
              return 0;
       }
   }
  int pop(int size)
   {
       if(top == -1)
       {
              return -1;
       }
       else
       {
              top--;
              return 0;
       }
   }
  int peek()
   {
       if(top == -1)
       {
              return -1;
       }
       else
       {
              return arr[top];
       }
   }
 }

class Queue
 {
       int front,rear;
       int[] arr1;

       Queue(int size)
        {
              front = -1;
              rear = -1;
              arr1 = new int[size];
        }
       int enqueue(int number,int size)
        {
              if(rear >= size-1)
              {
                     return -1;
              }
              else if(front == -1 && rear == -1)
              {
                     front = rear = 0;
                     arr1[rear] = number;
                     return 0;
              }
              else
              {
                     rear++;
                     arr1[rear] = number;
                     return 0;
              }
        }
       int dequeue(int size)
        {
              if(front == -1)
              {
                     return -1;
              }
              else if(front == rear)
              {
                     front = rear = -1;
                     return 0;
              }
              else
              {
                     front++;
                     return 0;
              }
        }
       void display(int size)
        {
              if(front == -1)
              {
                     System.out.println("Queue is empty..");
              }
              else
              {
                     System.out.println("Elements are : ");
                     for(int front = 0; front <= rear; front++)
                     {
                            System.out.println(arr1[front]);
                     }
              }
        }
 }
class StackQueue
 {
  public static void main(String args[])
   {
    int size,choice,pushnum,stackchoice,queuechoice,enquenum;
    Scanner sc = new Scanner(System.in);
    do
    {
    System.out.println("*************************************************");
    System.out.print("\nMain Menu.");
    System.out.print("\n1.Stack");
    System.out.print("\n2.Queue");
    System.out.print("\n3.Exit");
    System.out.print("\nEnter the choice : ");
    choice = sc.nextInt();
    System.out.println("*************************************************");
    switch(choice)
     {
      case 1:
             System.out.print("\nEnter the size : ");
    	      size = sc.nextInt();
             Stack s = new Stack(size);
             do
             {
             System.out.println("*************************************************");
             System.out.println("\nStack Menu........");
             System.out.println("1.Push");
             System.out.println("2.Pop");
             System.out.println("3.Peek");
             System.out.println("4.Exit");
             System.out.println("Enter the choice : ");
             stackchoice = sc.nextInt();
             System.out.println("*************************************************");
             switch(stackchoice)
              {
                     case 1:
                            System.out.println("*************************************************");
                            System.out.println("Enter the number : ");
                            pushnum = sc.nextInt();
                            if(s.push(pushnum,size) == -1)
                            {
                                   System.out.println("Stack is full...");
                            }
                            else
                            {
                                   System.out.println("Element is inserted..");
                            }
                            System.out.println("*************************************************");
                            break;
                     case 2:
                            System.out.println("*************************************************");
                            if(s.pop(size) == -1)
                            {
                                   System.out.println("Stack is empty..");
                            }
                            else
                            {
                                   System.out.println("Element is popped.");
                            }
                            System.out.println("*************************************************");
                            break;
                     case 3:
                            System.out.println("*************************************************");
                            if(s.peek() == -1)
                            {
                                   System.out.println("Stack is empty..");
                            }
                            else
                            {
                                   System.out.println("The peek element is : " + s.peek());
                            }
                            System.out.println("*************************************************");
                            break;
                     case 4:
                            break;
                     default:
                            System.out.println("Entered option is wrong!!");
              }
              }while(stackchoice != 4);
             break;
      case 2:
             System.out.print("\nEnter the size : ");
             size = sc.nextInt();
             Queue q = new Queue(size);
             do
             {
              System.out.println("*************************************************");
              System.out.println("Queue Menu.....");
              System.out.println("1.Enqueue.");
              System.out.println("2.Dequeue.");
              System.out.println("3.Display.");
              System.out.println("4.Exit.");
              System.out.println("Enter the choice : ");
              queuechoice = sc.nextInt();
              System.out.println("*************************************************");
              switch(queuechoice)
               {
                     case 1:
                            System.out.println("*************************************************");
                            System.out.println("Enter the number : ");
                            enquenum = sc.nextInt();
                            if(q.enqueue(enquenum,size) == -1)
                            {
                                   System.out.println("Queue is full..");
                            }
                            else
                            {
                                   System.out.println("Element is inserted in queue.");
                            }
                            System.out.println("*************************************************");
                            break;
                     case 2:
                            System.out.println("*************************************************");
                            if(q.dequeue(size) == -1)
                            {
                                   System.out.println("Queue is empty..");
                            }
                            else
                            {
                                   System.out.println("Element is deleted..");
                            }
                            System.out.println("*************************************************");
                            break;
                     case 3:
                            System.out.println("*************************************************");
                            q.display(size);
                            System.out.println("*************************************************");
                            break;
                     case 4:
                            break;
                     default:
               }
             }while(queuechoice != 4);
             break;
      case 3:
             break;
      default:
             System.out.println("Wrong option entered.");
     }
     }while(choice != 3);
   }
 }