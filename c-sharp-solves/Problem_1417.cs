public class Solution {
    public string Reformat(string s)
    {
        if (s.Length < 2) return s;
        Stack<char> digits = new Stack<char>();
        Stack<char> letters = new Stack<char>();

        foreach (var character in s)
        {
            if (character >= '0' && character <= '9') digits.Push(character);
            else letters.Push(character);
        }

        if (digits.Count < 1 || letters.Count < 1) return "";
        if (Math.Abs(digits.Count - letters.Count) > 1) return "";

        StringBuilder sb = new StringBuilder();
        bool lettersIsLarger = false;
        if (letters.Count > digits.Count)
        {
            lettersIsLarger = true;
            sb.Append(letters.Pop());
        }
        else if (letters.Count < digits.Count) sb.Append(digits.Pop());    

        return lettersIsLarger ? 
            MakeString(sb, digits, letters) : MakeString(sb, letters, digits);
    }
    
    public string MakeString(StringBuilder sb, Stack<char> smaller, Stack<char> larger)
    {
        for (int i = 0; smaller.Count > 0; i++)
        {
            sb.Append(smaller.Pop());
            sb.Append(larger.Pop());
        }
        return sb.ToString();
        
    }
}