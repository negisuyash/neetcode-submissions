class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s:strs){
            res.append(s.length()+"#"+s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int slashIdx = str.indexOf("#", i);
            int size = Integer.parseInt(str.substring(i, slashIdx));
            i = slashIdx+1;
            res.add(str.substring(i, i+size));
            i+=size;
        }
        return res;
    }
}
