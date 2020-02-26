import com.sun.source.tree.NewArrayTree;

public class Caesar {
    private int key;
    private char[] chars;

    public Caesar(int key) {
        this.key = key;
        this.chars = new char[]
                {'a','b', 'c', 'd', 'e', 'f', 'g', 'h',
                        'i', 'j', 'k', 'l', 'm', 'n', 'o',
                        'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z'};
    }

    public String cipher(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                newText = newText + " ";
            }
            else {
                for (int j = 0; j < 26; j++) {
                    if (text.charAt(i) == chars[j]) {
                        newText = newText + chars[(j+this.key) % 26];
                    }
                }
            }
        }
        return newText;
    }

    public String decipher(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                newText = newText + " ";
            }
            else {
                for (int j = 0; j < 26; j++) {
                    if (text.charAt(i) == chars[j]) {
                        newText = newText + chars[(j-this.key) % 26];
                    }
                }
            }
        }
        return newText;
    }
}
