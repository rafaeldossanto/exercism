public class Player
{
    private readonly Random random = new Random();
    public int RollDie()
    {
        return random.Next(1, 19);
    }

    public double GenerateSpellStrength()
    {
        return random.NextDouble() * 100.0;
    }
}
