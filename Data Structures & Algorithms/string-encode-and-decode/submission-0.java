class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String str : strs) {
            int len = str.length();
            encoded = encoded + len + "|" + str;
        }
        return encoded;

    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int len = 0;
            while (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                len = (len * 10) + (str.charAt(i) - '0');
                i ++;
            }
            if (str.charAt(i) == '|'){
                i ++;
                decoded.add(str.substring(i , i + len));

            }
            i += len;
        }
        return decoded;

    }
}
