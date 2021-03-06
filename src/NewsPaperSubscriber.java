//Karl Shane Pakilit
import java.util.ArrayList;

public abstract class NewsPaperSubscriber 
{
    private String streetAdd;
    protected double subscriptionRate;
    
    public String getStreetAdd()
    {
        return streetAdd;
    }
    
    public Double getSubscriptionRate()
    {
        return subscriptionRate;
    }
    
    public void setStreetAdd(String streetAdd)
    {
        this.streetAdd = streetAdd;
    }
    
    public abstract void setSubscriptionRate();

    public static void displayAll(ArrayList subscribers)
    {
        for(int i = 0; i < subscribers.size(); i++)
            System.out.println(subscribers.get(i).toString());
    }
    
    public static Boolean isSubscriberEqual(NewsPaperSubscriber sub1, NewsPaperSubscriber sub2)
    {
        return sub1.getStreetAdd().equals(sub2.getStreetAdd());
    }
}
