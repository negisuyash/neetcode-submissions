class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dict = new int[26];
        for(int i=0;i<order.length();i++){
            dict[order.charAt(i)-'a'] = i;
        }
        Comparator<String> compare = (w1, w2) -> {
            int len = Math.min(w1.length(),w2.length());
            for(int i=0;i<len;i++){
                if(w1.charAt(i)!=w2.charAt(i))
                    return dict[w1.charAt(i)-'a'] - dict[w2.charAt(i)-'a'];
            }
            return w1.length() - w2.length();
        };
        String[] sorted = words.clone();
        Arrays.sort(sorted, compare);
        return Arrays.equals(words, sorted);
    }
}