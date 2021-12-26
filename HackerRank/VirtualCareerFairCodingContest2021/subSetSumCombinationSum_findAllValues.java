class Result {

    /*
     * Complete the 'findAllValues' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */
    static HashSet<Integer> set;
    public static List<Integer> findAllValues(List<Integer> prices, int k) {
        set = new HashSet<>();
        // int arr[] = new int[]{1,2,4,6,11};
        // int k = 12;
        int arr[] = new int[prices.size()];
        for(int i=0; i<prices.size(); i++) arr[i] = prices.get(i);
        List<List<Integer>> lists = combinationSum2(arr, k);
        // System.out.println(lists);
        for(List<Integer> subset: lists) {
            subsetSums(subset, 0, subset.size()-1, 0);
        }
        // System.out.println(set);

        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        Arrays.sort(candidates);

        backtrack(candidates, comb, target, 0, results);
        return results;
    }

    private static void backtrack(int[] candidates, LinkedList<Integer> comb,
                           Integer remain, Integer curr,
                           List<List<Integer>> results) {
        if (remain == 0) {
            // copy the current combination to the final list.
            results.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int nextCurr = curr; nextCurr < candidates.length; ++nextCurr) {
            if (nextCurr > curr && candidates[nextCurr] == candidates[nextCurr - 1])
                continue;

            Integer pick = candidates[nextCurr];
            // optimization: early stopping
            if (remain - pick < 0)
                break;

            comb.addLast(pick);
            backtrack(candidates, comb, remain - pick, nextCurr + 1, results);
            comb.removeLast();
        }
    }
    
    static void subsetSums(List<Integer> arr, int l, int r, int sum) {
        if (l > r) {
            set.add(sum);
//            System.out.print(sum + " ");
            return;
        }
 
        // Subset including arr[l]
        subsetSums(arr, l + 1, r, sum + arr.get(l));
 
        // Subset excluding arr[l]
        subsetSums(arr, l + 1, r, sum);
    }

}
