public class Codec {
    readonly Dictionary<string, string> _dictionary = new();
    // Encodes a URL to a shortened URL    
    public string encode(string longUrl) 
    {
        int length = longUrl.Length / 8;
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        sb.Append("http://tinyurl.com/");
        while (length > -1) 
        {
            if (length % 2 == 0) 
            {
                sb.Append((char)rand.Next(48, 58));
            } 
            else if (length % 3 == 0)
            {
                sb.Append((char)rand.Next(65, 91));
            } else {
                sb.Append((char)rand.Next(97,123));
            }

            length--;
        }
        _dictionary.Add(sb.ToString(), longUrl);
        return sb.ToString();
    }

    // Decodes a shortened URL to its original URL.
    public string decode(string shortUrl) {
        return _dictionary[shortUrl];
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));