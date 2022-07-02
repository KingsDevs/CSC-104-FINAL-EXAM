//Karl Shane Pakilit
import java.util.ArrayList;
import java.util.Scanner;


public class Subscribers 
{
   
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int choice;

        ArrayList<SevenDaySubscriber> sevenDaySubscribers = new ArrayList<SevenDaySubscriber>();
        ArrayList<WeekDaySubscriber> weekDaySubscribers = new ArrayList<WeekDaySubscriber>();
        ArrayList<WeekendSubsciber> weekendSubscibers = new ArrayList<WeekendSubsciber>(); 

        while (true) 
        {
            
            System.out.println("1. Display Subscribers");
            System.out.println("2. Subscriber to a News Paper");
            System.out.println("3. Exit");
            System.out.print(">> ");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1)
            {
                System.out.println("1. Seven Day Subscriber");        
                System.out.println("2. Week Day Subscriber");        
                System.out.println("3. Weekend Subscriber"); 
                System.out.print(">> ");
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        NewsPaperSubscriber.displayAll(sevenDaySubscribers);
                        break;
                    case 2:
                        NewsPaperSubscriber.displayAll(weekDaySubscribers);
                        break;
                    case 3:
                        NewsPaperSubscriber.displayAll(weekendSubscibers);
                        break;
                    default:
                        System.out.println("Not in choices");
                }
            }
            else if(choice == 2)
            {
                System.out.print("Enter Street Address: ");
                String streetAdd = input.nextLine();

                System.out.println("Choose a Service!");
    
                System.out.println("1. Seven Day Subscriber");        
                System.out.println("2. Week Day Subscriber");        
                System.out.println("3. Weekend Subscriber");
                System.out.print(">> ");
                choice = input.nextInt();
                
                boolean isNewSubsciber = true;

                switch (choice) 
                {
                    case 1:
                        NewsPaperSubscriber newSubscriber = new SevenDaySubscriber(streetAdd);
                        for(int i = 0; i < sevenDaySubscribers.size(); i++)
                        {
                            if(NewsPaperSubscriber.isSubscriberEqual(newSubscriber, sevenDaySubscribers.get(i)))
                            {
                                System.out.println("Already Subscibed!");
                                isNewSubsciber = false;
                                break;
                            }
                        }

                        if(isNewSubsciber)
                        {
                            sevenDaySubscribers.add((SevenDaySubscriber)newSubscriber);
                            System.out.println("Subscriber Added!");
                        }
                        
                        break;

                    case 2:
                        newSubscriber = new WeekDaySubscriber(streetAdd);
                        for(int i = 0; i < weekDaySubscribers.size(); i++)
                        {
                            if(NewsPaperSubscriber.isSubscriberEqual(newSubscriber, weekDaySubscribers.get(i)))
                            {
                                System.out.println("Already Subscibed!");
                                isNewSubsciber = false;
                                break;
                            }
                        }

                        if(isNewSubsciber)
                        {
                            weekDaySubscribers.add((WeekDaySubscriber)newSubscriber);
                            System.out.println("Subscriber Added!");
                        }
                        
                        break;

                    case 3:
                        newSubscriber = new WeekendSubsciber(streetAdd);
                        for(int i = 0; i < weekendSubscibers.size(); i++)
                        {
                            if(NewsPaperSubscriber.isSubscriberEqual(newSubscriber, weekendSubscibers.get(i)))
                            {
                                System.out.println("Already Subscibed!");
                                isNewSubsciber = false;
                                break;
                            }
                        }

                        if(isNewSubsciber)
                        {
                            weekendSubscibers.add((WeekendSubsciber)newSubscriber);
                            System.out.println("Subscriber Added!");
                        }
                        
                        break;
                }
                
            }
            else
                break;
                  
        }
        
    }
}
