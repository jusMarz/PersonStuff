public class President extends Person
{
    private int inaugurationYear;

    public President(int a, String s, int i)
    {
        super(a,s);
        inaugurationYear = i;
    }

    public int getInaugurationYear() {
        return inaugurationYear;
    }

    public void brag()
    {
        System.out.println("This country is so great, so great I say. This country, this great country, deserves the greatest president, they ask me, how I am so great, such a great leader, I tell them blame my country... ");
    }
}
