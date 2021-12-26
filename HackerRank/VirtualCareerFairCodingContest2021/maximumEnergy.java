class Result {

    /*
     * Complete the 'maxEnergy' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY mat as parameter.
     */

    public static int maxEnergy(List<List<Integer>> mat) {
    // Write your code here
        boolean visited[][];
        for(int j=0; j<mat.size(); j++) {
            visited = new boolean[mat.size()][mat.get(0).size()];
            dfs(mat, 0, j, 100, visited);
        }
        return max;
    }
    static int max = Integer.MIN_VALUE;
    static void dfs(List<List<Integer>> mat, int i, int j, int en, boolean[][]visited) {
        if(i<0 || j<0 || i>mat.size() || j>=mat.get(0).size()) {
            return;
        }
        
        // System.out.println("max:"+max+", i:"+i+", j:"+j+", en:"+en);
        if(i == mat.size()) {
            max = Math.max(max, en);
            return;
        }
        if(visited[i][j]) return;
        visited[i][j] = true;
        
        
        dfs(mat, i+1, j-1, en - mat.get(i).get(j), visited);
        dfs(mat, i+1, j, en - mat.get(i).get(j), visited);
        dfs(mat, i+1, j+1, en - mat.get(i).get(j), visited);
        visited[i][j] = false;
    }

}
