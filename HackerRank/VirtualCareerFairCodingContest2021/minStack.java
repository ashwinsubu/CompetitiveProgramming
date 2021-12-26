public static int PERFECTminStacks(List<Integer> tol) {
        //  System.out.println("size:"+tol.size());
        // System.out.println(tol);
       
      int n = tol.size();
 
        // Keep track of occurrence
        // of each capacity
        TreeMap<Integer, Integer> occ = new TreeMap<>();
        
        // Fill the occurrence map
        for (int i = 0; i < n; i++)
            occ.put(tol.get(i), occ.get(tol.get(i)) == null ? 1 :
                          occ.get(tol.get(i)) + 1);
 
        // Number of piles is 0 initially
        int pile = 0;
 
        // Traverse occurrences in increasing
        // order of capacities.
        System.out.println(occ);
        while (!occ.isEmpty()) {
            // Adding a new pile
            pile++;
            int size = 0;
            HashSet<Integer> toRemove = new HashSet<>();
 
            // Traverse all piles in increasing
            // order of capacities
            for (HashMap.Entry<Integer, Integer> tm : occ.entrySet()) {
                int mx = tm.getKey();
                int ct = tm.getValue();
 
                // Number of boxes of capacity mx
                // that can be added to current pile
                int use = Math.min(ct, mx - size+1);
 
                // Update the occurrence
                occ.put(mx, occ.get(mx) - use);
 
                // Update the size of the pile
                size += use;
                if (occ.get(mx) <= 0)
                    toRemove.add(mx);
            }
 
            // Remove capacities that are
            // no longer available
            for (int tm : toRemove)
                occ.remove(tm);
        }
        

        return pile;
    }
