// See https://aka.ms/new-console-template for more information


public class Problem_125
{
    public static void Main(string[] args)
    {
        Console.WriteLine(SingleNumber(new int[] { 2, 2, 3, 1, 1, 7, 3 }));
    }

    public static int SingleNumber(int[] nums)
    {
        IDictionary<int, int> dictionary = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            if (dictionary.ContainsKey(nums[i]))
            {
                dictionary[nums[i]]++;
            }
            else
            {
                dictionary.Add(nums[i], 1);
            }
        }



        foreach (KeyValuePair<int, int> keyValuePair in dictionary)
        {
            // Console.WriteLine(keyValuePair.Key + " " + keyValuePair.Value);
            if (keyValuePair.Value == 1)
            {
                return keyValuePair.Key;
            }
        }


        return 0;
    }
}