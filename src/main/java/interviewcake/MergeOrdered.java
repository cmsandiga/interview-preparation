package interviewcake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makoto on 25/06/17.
 */
public class MergeOrdered {


    public List<Integer> order(List<Integer> myList, List<Integer> aliceList) {

        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>(myList.size() + aliceList.size());

        while (i <= myList.size() - 1 || j <= aliceList.size() - 1) {

            if (i <= myList.size() - 1 && j <= aliceList.size() - 1) {
                if (myList.get(i) > aliceList.get(j)) {
                    result.add(aliceList.get(j));
                    j++;
                } else {
                    result.add(myList.get(i));
                    i++;
                }
            } else if(i >= myList.size() - 1){
                result.addAll(aliceList.subList(j, myList.size()));
                break;
            } else{
                result.addAll(myList.subList(i, myList.size()));
                break;
            }

        }

        return result;
    }
}
