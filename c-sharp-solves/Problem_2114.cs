// See https://aka.ms/new-console-template for more information


using System.Text;
using Microsoft.VisualBasic.CompilerServices;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine(MostWordsFound(new string[]
        {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        }));
    }

    public static int MostWordsFound(string[] sentences)
    {
        int maxNumOfWords = 0;
        foreach (string sentence in sentences)
        {
            int localMax = 1;
            foreach (char letter in sentence)
            {
                if (letter == ' ') { localMax++; }
            }
            if (localMax > maxNumOfWords) { maxNumOfWords = localMax; }
        }

        return maxNumOfWords;
    }
}