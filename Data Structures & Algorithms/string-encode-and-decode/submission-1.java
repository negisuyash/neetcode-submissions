class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str:strs){
            s.append(str.length() + "#" + str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int slash = str.indexOf("#", i);
            int size = Integer.parseInt(str.substring(i, slash));
               i = slash + 1;
            res.add(str.substring(i, i + size));
            i +=size;
        }
        return res;
        // List<String> res = new ArrayList<>();
        // int i = 0;
        // while (i < s.length()) {
        //     // Find the delimiter
        //     int slash = s.indexOf('#', i);
        //     // Parse the length of the next string
        //     int size = Integer.parseInt(s.substring(i, slash));
        //     i = slash + 1;
            
        //     // Extract the string based on the parsed length
        //     res.add(s.substring(i, i + size));
            
        //     // Move pointer to the start of the next length-prefix
        //     i += size;
        // }
        // return res;
    }
}
