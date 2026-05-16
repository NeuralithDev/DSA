package Arrays;

import java.util.Arrays;

public class MissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int freq[] = new int[n*n + 1];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < grid[i].length ; j++) {
                freq[grid[i][j]]++;
            
            }
        }
        int ans[] = new int[2];
        for(int i = 1 ; i <= n*n ; i++) {
            if(freq[i] == 2) {
                ans[0] = i;
            }
            if(freq[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
    
        MissingAndRepeatedValues solver = new MissingAndRepeatedValues();

        int[][] testGrid = {
            {9, 1, 7},
            {8, 9, 2},
            {3, 4, 6}
        };

        int[] result = solver.findMissingAndRepeatedValues(testGrid);

        System.out.println("Grid processed successfully.");
        System.out.println("Result [Repeated, Missing]: " + Arrays.toString(result));
    }
}
