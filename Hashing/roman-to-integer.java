//****************************
// First method
//****************************
class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        // first note: we put a single character betwen '' and a string betwen ""
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                sum += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += map.get(s.substring(i, i + 1));
                i++;
            }

        }
        return sum;

    }
}
//****************************
// Second method
//****************************

class Solution {
    // the keyword private means:
    // This method can only be used inside the same class.
    private int value(String c) {
        switch (c) {
            case "I":
                return 1;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XL":
                return 40;
            case "L":
                return 50;
            case "XC":
                return 90;
            case "C":
                return 100;
            case "CD":
                return 400;
            case "D":
                return 500;
            case "CM":
                return 900;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {

        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            if (i + 1 < s.length() && value(s.substring(i, i + 2)) != 0) {
                sum += value(s.substring(i, i + 2));
                i += 2;

            } else {
                sum += value(s.substring(i, i + 1));
                i++;

            }
        }
        return sum;

    }
}
