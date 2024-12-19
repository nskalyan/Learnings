import java.util.HashMap;

class Solution {
    public int maxPoints(int[][] points) {
        if (points == null || points.length < 2) return points.length;
        
        int max = 1; // At least one point will be there
        
        // Iterate through each point
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> slopeMap = new HashMap<>();
            int duplicates = 0; // To count duplicate points
            
            // Compare point i with every other point
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                if (dx == 0 && dy == 0) {
                    duplicates++; // Count duplicate points
                    continue;
                }

                // Normalize the slope by using gcd
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                
                // To avoid negative slope normalization issues
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    dy = Math.abs(dy);
                }
                
                String slope = dx + "," + dy; // Key for the map
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
            }

            // Get the maximum number of points on a line for this point
            int localMax = duplicates;
            for (int count : slopeMap.values()) {
                localMax = Math.max(localMax, count);
            }
            
            max = Math.max(max, localMax + 1); // Add 1 for the current point itself
        }

        return max;
    }

    // Helper method to find gcd
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

