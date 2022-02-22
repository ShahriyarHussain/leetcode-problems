public class Solution
{
    public string Interpret(string command)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.Length; i++)
        {
            if (command[i] == '(')
            {
                if (i + 1 == command.Length) break;
                if (command[i + 1] == ')')
                {
                    sb.Append('o');
                    i++;
                }
                continue;
            }

            if (!(command[i] == ')'))
            {
                sb.Append(command[i]);
            }

        }
        return sb.ToString();
    }
}