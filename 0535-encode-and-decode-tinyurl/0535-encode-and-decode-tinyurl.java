public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder s=new StringBuilder(longUrl);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            c++;
            s.setCharAt(i,c);
        }
        return s.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder s=new StringBuilder(shortUrl);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            c--;
            s.setCharAt(i,c);
        }
        return s.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));