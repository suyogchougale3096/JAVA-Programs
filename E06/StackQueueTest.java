import java.util.Scanner;
interface StackInterface
 {
  void initialization(int size);
  int push(int pushnum,int size);
  int pop();
  int peek();
  void display();
 }

interface QueueInterface
 {
       void initialization1(int size1);
       int enqueue(int pushnum1,int size1);
       int dequeue();
       void display1();
 }

class StackQueue implements StackInterface,QueueInterface
 {
  int top;
  int[] arr;
  int[] arr1;
  int front,rear;
  //Stack.
  public void initialization(int size)
   {
    top = -1;
    arr = new int[size];
   }
  public int push(int pushnum,int size)
   {
    if(top >= size-1)
     {
      return -1;
     }
    else
     {
      top++;
      arr[top] = pushnum;
      return 0;
     }
   }
  public int pop()
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
  public int peek()
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
  public void display()
   {
    if(top == -1)
     {
      System.out.println("There are nothing..");
     }
    else
     {
      System.out.println("Elements in stack : ");
      for(int i = top; i >= 0; i--)
      {
       System.out.println(arr[i]);
      }
     }
   }
   //Queue.
   public void initialization1(int size1)
    {
       front = -1;
       rear = -1;
       arr1 = new int[size1];
    }
   public int enqueue(int pushnum1,int size1)
    {
       int temp;
       if(front == -1 && rear == -1)
       {
              front = rear = 0;
              arr1[rear] = pushnum1;
              temp = 0;
       }
       else if(rear >= size1-1)
       {
               temp = -1;
       }
       else
       {
              rear++;
              arr1[rear] = pushnum1;
              temp = 0;
       }
       return temp;
    }
   public int dequeue()
    {
       int temp;
       if(front == -1)
       {
              temp = -1;
       }
       else if(front == rear)
       {
              front = rear = -1;
              temp = 0;
       }
       else
       {
              front++;
              temp = 0;
       }
       return temp;
    }
    public void display1()
     {
       if(front == -1 && rear == -1)
       {
              System.out.println("Queue is empty.");
       }
       else
       {
              System.out.println("Elements are : ");
              for(int i = front; i <= rear; i++)
              {
                     System.out.println(arr1[i]);
              }
       }
     }
 }

class StackQueueTest
 {
  public static void main(String a[])
   {
    int size,choice,stackchoice,pushnum,peek1,queuechoice,size1;
    Scanner sc = new Scanner(System.in);
    StackQueue s = new StackQueue();
    do
    {
     System.out.println("******************************************");
     System.out.println("Menu...");
     System.out.println("1.Stack.");
     System.out.println("2.Queue.");
     System.out.println("3.Exit.");
     System.out.println("Enter the choice : ");
     choice = sc.nextInt();
     switch(choice)
      {
       case 1:
              System.out.println("Enter the size : ");
              size = sc.nextInt();
              s.initialization(size);
              do{
              System.out.println("******************************************");
              System.out.println("Stack Menu...");
              System.out.println("1.Push Item.");
              System.out.println("2.Pop Item.");
              System.out.println("3.Peek Item.");
              System.out.println("4.Display Items.");
              System.out.println("5.Exit.");
              System.out.println("Enter the choice : ");
              stackchoice = sc.nextInt();
              switch(stackchoice)
               {
                case 1:
                       System.out.println("Enter the number to be push : ");
                       pushnum = sc.nextInt();
                       if(s.push(pushnum,size) == -1)
                        {
                         System.out.println("Stack is overflow.");
                        }
                       else
                        {
                         System.out.println("Element is inserted.");
                        }
                       break;
                case 2:
                       if(s.pop() == -1)
                        {
                         System.out.println("Stack is underflow.");
                        }
                       else
                        {
                         System.out.println("Element is popped.");
                        }
                       break;
                case 3:
                       peek1 = s.peek();
                       if(peek1 == -1)
                        {
                         System.out.println("Stack is underflow.");
                        }
                       else
                        {
                         System.out.println("The peek element is : "+peek1);
                        }
                       break;
                case 4:
                       s.display();
                       break;
                case 5:
                       break;
                default:
                       System.out.println("Wrong option.");
               }
               }while(stackchoice != 5);
	      break;
       case 2:
              System.out.println("Enter the size : ");
              size1 = sc.nextInt();
              s.initialization1(size1);
              do
              {
                     System.out.println("******************************************");
                     System.out.println("Queue Menu...");
                     System.out.println("1.Enqueue");
                     System.out.println("2.Dequeue");
                     System.out.println("3.Display");
                     System.out.println("4.Exit");
                     System.out.println("Enter the choice : ");
                     queuechoice = sc.nextInt();

                     switch(queuechoice)
                      {
                            case 1:
                                   System.out.println("Enter the number to be push : ");
                                   pushnum = sc.nextInt();
                                   if(s.enqueue(pushnum,size1) == -1)
                                   {
                                          System.out.println("Queue is full...");
                                   }
                                   else
                                   {
                                          System.out.println("Element is inserted..");
                                   }
                                   break;
                            case 2:
                                   if(s.dequeue() == -1)
                                   {
                                          System.out.println("Queue is empty...");
                                   }
                                   else
                                   {
                                          System.out.println("Element is deleted.");
                                   }
                                   break;
                            case 3:
                                   s.display1();
                                   break;
                            case 4:
                                   break;
                            default:
                                   System.out.println("Wrong option!!");
                      }
              }while(queuechoice != 4);
              break;
       case 3:
              break;
       default:
		System.out.println("You entered wrong option please try again!");
      }
    }while(choice != 3);
   }
 }
