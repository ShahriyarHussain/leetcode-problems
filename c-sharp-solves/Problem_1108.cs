// See https://aka.ms/new-console-template for more information


using System.Text;
using Microsoft.VisualBasic.CompilerServices;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine(DefangIPaddr("1.1.1.1"));
    }

    public static string DefangIPaddr(string address)
    {
        if (address.Length == 0) return address;
        StringBuilder defangedIPaddr = new StringBuilder();

        foreach (char letter in address)
        {
            if (letter == '.')
            {
                defangedIPaddr.Append("[.]");
            }
            else
            {
                defangedIPaddr.Append(letter);
            }
        }
        return defangedIPaddr.ToString();
    }
}