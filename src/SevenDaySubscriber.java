
public class SevenDaySubscriber extends NewsPaperSubscriber 
{

    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 5.0;
    }

    public SevenDaySubscriber(String streetAdd)
    {
        setSubscriptionRate();
        super.setStreetAdd(streetAdd);
    }

    @Override
    public String toString()
    {
        return "Seven Day Subscriber | Rate: " + super.getSubscriptionRate() + " | Street Address: " + super.getStreetAdd();
    }
    
}
