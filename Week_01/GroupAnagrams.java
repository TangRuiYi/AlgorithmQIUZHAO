package practice;

import java.util.*;

public class GroupAnagrams1 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int[] words = new int[26];
        for (int i = 0; i < strs.length; i++) {
            Arrays.fill(words, 0);
            for (int j = 0; j < strs[i].length(); j++) {
                words[strs[i].charAt(j) - 'a']++;
            }
            String ele = "";
            for (int k = 0; k < words.length; k++) {
                ele += words[k] + "#";
            }
            if (!map.containsKey(ele)) {
                map.put(ele, new ArrayList());
            }
            map.get(ele).add(strs[i]);
        }
        return new ArrayList(map.values());
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList());
            map.get(keyStr).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams2(strs);
    }
}
