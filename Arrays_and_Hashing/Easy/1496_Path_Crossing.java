class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0,0"); // Starting point

        int x = 0, y = 0;
        for (char ch : path.toCharArray()) {
            // Update coordinates based on the direction
            if (ch == 'N') {
                y++; // Move up
            } else if (ch == 'S') {
                y--; // Move down
            } else if (ch == 'E') {
                x++; // Move right
            } else if (ch == 'W') {
                x--; // Move left
            }

            // Create a unique key for the current position
            String key = x + "," + y;
            // Check if this position was visited before
            if (visited.contains(key)) return true;
            // Mark the position as visited
            visited.add(key);
        }

        return false; // No crossing found
    }
}
