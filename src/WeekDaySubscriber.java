
public class WeekDaySubscriber extends NewsPaperSubscriber
{
    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 4.0;
    }

    public WeekDaySubscriber(String streetAdd)
    {
        setSubscriptionRate();
        super.setStreetAdd(streetAdd);
    }

    @Override
    public String toString()
    {
        return "Week Day Subscriber | Rate: " + super.getSubscriptionRate() + " | Street Address: " + super.getStreetAdd();
    }    
}
