import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int index=0;index<s.length();index++){
            if(index>0 && s.charAt(index-1)=='I'){
                if(s.charAt(index)=='V' || s.charAt(index)=='X'){
                    res+=map.get(s.charAt(index))-2;
                }
                else{
                    res+=map.get(s.charAt(index));
                }

            }
            else if(index>0 && s.charAt(index-1)=='X'){
                if(s.charAt(index)=='L' || s.charAt(index)=='C'){
                    res+=map.get(s.charAt(index))-20;
                }
                else{
                    res+=map.get(s.charAt(index));
                }
            }
            else if(index>0 && s.charAt(index-1)=='C'){
                if(s.charAt(index)=='D' || s.charAt(index)=='M'){
                    res+=map.get(s.charAt(index))-200;
                }
                else{
                    res+=map.get(s.charAt(index));
                }
            }
            else{
                res+=map.get(s.charAt(index));
            }
        }
        return res;
    }
}