

public class isAnagram {

    public boolean solveAnagram(String wordOne, String wordTwo) {
        
        if (wordOne.equalsIgnoreCase(wordTwo)) {
            return false;
        }if(wordOne.length() != wordTwo.length()) {
            return false;
        }

        int[] charCount = new int[26];
        
        for (int i = 0; i < wordOne.length(); i++) {
            charCount[wordOne.toLowerCase().charAt(i) - 'a']++;
            charCount[wordTwo.toLowerCase().charAt(i) - 'a']--;

        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
