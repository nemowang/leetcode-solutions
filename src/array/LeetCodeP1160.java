package array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeP1160 {

    @Test
    public void leetCodeP1160() {
        String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        int i = countCharacters(words, chars);
        System.out.println(i);
    }

    public int countCharacters(String[] words, String chars) {
        char[] charArray = chars.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        // 使用hashMap记录字符出现次数
        for (char c : charArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        int countTotal = 0;
        for (String word : words) {
            boolean flag = true;
            int count = 0;
            Map<Character, Integer> newMap = copyMap(charMap);
            char[] wordChar = word.toCharArray();
            for (char c : wordChar) {
                if (!newMap.containsKey(c) || newMap.getOrDefault(c, 0) < 1) {
                    flag = false;
                    break;
                } else {
                    newMap.put(c, newMap.get(c) - 1);
                    count ++;
                }
            }
            countTotal = flag ? countTotal + count : countTotal;
        }
        return countTotal;
    }

    /**
     * map深拷贝
     */
    private Map<Character, Integer> copyMap(Map<Character, Integer> sourceMap) {
        Map<Character, Integer> newMap = new HashMap<>(sourceMap.size());

        for (Map.Entry<Character, Integer> entry : sourceMap.entrySet()) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }
}
