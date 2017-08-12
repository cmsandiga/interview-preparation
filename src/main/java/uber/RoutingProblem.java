package uber;

import util.Travel;

import java.util.*;

/**
 * Created by makoto on 26/06/17.
 */
public class RoutingProblem {

    public List<List<String>> findRoutes(List<Travel> pairs) {

        Map<String, String> mp = new HashMap<>(pairs.size());

        for (Travel pair : pairs) {
            mp.put(pair.source, pair.target);
        }

        Set<String> end = new HashSet<>(mp.values());

        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, String> entry : mp.entrySet()) {

            if (!end.contains(entry.getKey())) {

                List<String> route = new ArrayList<>();
                String key = entry.getKey();
                route.add(key);

                do {
                    key = mp.get(key);

                    if (key != null) {
                        route.add(key);
                    }

                } while (key != null);
                result.add(route);
            }
        }

        return result;
    }

}
