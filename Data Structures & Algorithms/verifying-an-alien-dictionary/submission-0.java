class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArr = new int[26];
        for(int i=0;i<order.length();i++){
            orderArr[order.charAt(i)-'a'] = i;
        }
        Comparator<String> compare = (w1, w2) -> {
            for(int i=0;i<Math.min(w1.length(), w2.length());i++){
                if(w1.charAt(i)!=w2.charAt(i))
                    return orderArr[w1.charAt(i)-'a'] - orderArr[w2.charAt(i)-'a'];
            }
            return w1.length() - w2.length();
        };
        String[] sortWords = words.clone();
        Arrays.sort(sortWords, compare);
        return Arrays.equals(words, sortWords);
    }
}