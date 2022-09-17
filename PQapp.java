import java.util.Scanner;
public class PQapp
{
    public static void main(String args[])
    {
        int c=0;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter size of Queue : ");
        PQueue<Integer> Q=new<Integer> PQueue(S.nextInt());
        do
        {
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.isEmpty");
            System.out.println("4.display");
            System.out.println("5.peek");
            System.out.println("6.exit");
            c=S.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter value to Enqueue :");
                    int a=S.nextInt();
                    Q.enqueue(a);
                    break;
                case 2:
                    System.out.println("Element deleted is : "+Q.dequeue());
                    break;
                case 3:
                    System.out.println(Q.isEmpty());
                    break;
                case 4:
                    Q.display();
                    break;
                case 5:
                    System.out.println("Peek element of this queue is :"+Q.peek());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        while(c!=6);
    }
}