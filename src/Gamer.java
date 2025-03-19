public class Gamer extends Person
{
    private int hoursOnFortnite;

    public Gamer(int a, String n, int hours)
    {
        super(a,n);
        hoursOnFortnite = hours;
    }

    public void playFortnite(int h)
    {
        hoursOnFortnite+= h;
    }

    public int getHoursOnFortnite() {
        return hoursOnFortnite;
    }

    public void complain()
    {
        System.out.println("That loser is just BUSHCAMPING HES BUSHCAMPING MEGA IS THIS YOUR PLAYER BASE JUST SITTING IN BUSHES LIKE A BUNCH OF HEDGETRIMMERS CHAT OH MY GOD THIS GAME IS DOGWATER");
    }

}
