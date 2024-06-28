import java.util.*;
class MaximumTotalImportanceofRoads_2285 {
    public long maximumImportance(int n, int[][] roads) {
        //find the road with most connections, give it valueof n-1
        //and then 2nd most and give it a value of n-2 and go until least connected road
        HashMap <Integer, Integer> map =  new HashMap<>();
        long importance =0;
        //put number of connections for each road
        for(int i=0; i<roads.length; i++)
        {
            for(int k=0; k<roads[0].length; k++)
            {
                int road = roads[i][k];
                map.put(road, map.getOrDefault(road, 0) + 1);
            }
        }
       List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), n--);
        }

        for(int i=0; i<roads.length; i++)
        {
            for(int k=0; k<roads[0].length; k++)
            {
                importance+=sortedMap.get(roads[i][k]);
            }
        }
        return importance;
    }
}