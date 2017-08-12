package booking;

import java.util.*;

/**
 * Created by makoto on 22/01/17.
 */
public class SortHotels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<Integer> dependency = new ArrayList<>();
            Map<Integer, List<Integer>> map = new HashMap<>();


            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                List<Integer> l = new ArrayList<>();
                for (int k = 0; k < d; k++) {
                    l.add(sc.nextInt());
                }
                Collections.reverse(l);
                map.put(j + 1, l);
            }

            for (int k = 0; k < m; k++) {
                dependency.add(sc.nextInt());
            }
            Set<Integer> set = new HashSet<>();
            Set<Integer> founded = new HashSet<>();
            LinkedList<Integer> result = new LinkedList<>();
            for (Integer prog : dependency) {
                Queue<Integer> queue = new LinkedList<>();
                LinkedList<Integer> resultTemp = new LinkedList<>();
                queue.add(prog);

                while(!queue.isEmpty()){
                    List<Integer> temp = map.get(queue.peek());

                    if(!temp.isEmpty() ){
                        for (Integer tempIt: temp){
                            if(!founded.contains(tempIt)){
                                queue.add(tempIt);
                                founded.add(tempIt);
                            }
                        }
                    }

                    resultTemp.addFirst(queue.remove());
                }

            }
        }
    }


}
