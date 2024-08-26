import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
public class LuckyNumbersinaMatrix_1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        HashMap<Integer,Integer> mapCol = new HashMap<>();
        HashMap<Integer,Integer> mapRow = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(mapRow.get(i+1)==null)
                {
                    mapRow.put(i+1,matrix[i][j]);
                }else{
                    int min = Math.min(mapRow.get(i+1),matrix[i][j]);
                    mapRow.put(i+1,min);
                }
                if(mapCol.get(j+1)==null)
                {
                    mapCol.put(j+1,matrix[i][j]);
                }else{
                    int min = Math.max(mapCol.get(j+1),matrix[i][j]);
                    mapCol.put(j+1,min);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : mapRow.entrySet()) {
            Integer value = entry.getValue();
            if(!set.contains(value))
            {
                set.add(value);
            }else{
                list.add(value);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapCol.entrySet()) {
            Integer value = entry.getValue();
            if(!set.contains(value))
            {
                set.add(value);
            }else{
                list.add(value);
            }
        }
        return list;
    }
}
