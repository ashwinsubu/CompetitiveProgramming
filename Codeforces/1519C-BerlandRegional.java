import java.util.*;

public class BerlandRegional {

        public static void main(String args[]){

            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t>0){
                int n = in.nextInt();
                int uni[] = new int[n];
                for(int i=0; i<n; i++){
                    uni[i] = in.nextInt();
                }
                long sum =0;
                Map<Integer, List<Long>> map = new HashMap<>();
                for(int i=0; i<n; i++){
                    List<Long> list = new ArrayList<>();
                    if(map.containsKey(uni[i])){
                        list = map.get(uni[i]);
                    }
                    long skill = in.nextLong();
                    sum+=skill;
                    list.add(skill);
                    map.put(uni[i], list);
                }
                StringBuilder sb = new StringBuilder();
                int maxlistsize=0;
                for(int key: map.keySet()){
                    List<Long> list = map.get(key);
                    Collections.sort(list, Collections.reverseOrder());
                    //store prefix sum from reverse side
                    long prevSum=0;
                    for(int i=list.size()-1; i>=0; i--){
                        prevSum+=list.get(i);
                        list.set(i, prevSum);
                    }
                    maxlistsize = Math.max(maxlistsize, list.size());
                    map.put(key, list);
                }
                sb.append(sum + " ");

                for(int k=2; k<=n; k++){
                    long sum2= sum;
                    if(k>maxlistsize){
                        sb.append("0 ");
                        continue;
                    }
                    for(int key: map.keySet()){
                        List<Long> list = map.get(key);
                        int rem = list.size()%k;
                        if(rem == 0) continue;
                        long subtract = list.get(list.size()-rem);
                        sum2 -= subtract;
                    }
                    sb.append(sum2 + " ");
                }
                System.out.println(sb.toString());
                t--;
            }
            in.close();
        }
}
