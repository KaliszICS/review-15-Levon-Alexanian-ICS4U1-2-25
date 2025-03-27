public class PracticeProblem {

    public static int goodString(String word) {
        int n = word.length();
        int minOperations = n; 
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (word.charAt(i) == word.charAt(j)) {
                    int operations = i + (n - j - 1);
                    minOperations = Math.min(minOperations, operations);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) return -1;

        found = false;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    int operations = j + (n - i - 1);
                    minOperations = Math.min(minOperations, operations);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        return minOperations;
    }

}
