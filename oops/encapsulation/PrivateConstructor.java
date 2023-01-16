public class Counter
{
    private Counter() { }

    public static int currentCount;

    public static int IncrementCount()
    {
        return currentCount++;
    }
}

class PrivateConstructor
{
    static void Main()
    {
        Counter aCounter = new Counter();   // Error because class is inaccessible due to it being private

        Counter.currentCount = 20;
        Counter.IncrementCount();
        Console.WriteLine("New count: ", + Counter.currentCount);

        // Keep the console window open in debug mode.
        Console.WriteLine("Press any key to exit");
        Console.ReadKey();
    }
}
