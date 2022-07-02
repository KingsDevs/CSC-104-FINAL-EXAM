//Karl Shane Pakilit

public class WeekendSubsciber extends NewsPaperSubscriber
{
    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 3.0;
    }

    public WeekendSubsciber(String streetAdd)
    {
        setSubscriptionRate();
        super.setStreetAdd(streetAdd);
    }

    @Override
    public String toString()
    {
        return "Weekend Subscriber | Rate: " + super.getSubscriptionRate() + " | Street Address: " + super.getStreetAdd();
    }
}
