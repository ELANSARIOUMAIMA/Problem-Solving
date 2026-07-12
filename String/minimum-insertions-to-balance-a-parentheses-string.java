class Solution {
    public int minInsertions(String s) {

        int open = 0;        // Number of unmatched '('
        int insertions = 0;  // Number of insertions made

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {

                // Check whether we have "))"
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    // Only one ')', so insert another ')'
                    insertions++;
                    i++;
                }

                // Match this "))" with a previous '('
                if (open > 0) {
                    open--;
                } else {
                    // No '(' available, insert one
                    insertions++;
                }
            }
        }

        // Every remaining '(' needs two ')'
        insertions += open * 2;

        return insertions;
    }
}
