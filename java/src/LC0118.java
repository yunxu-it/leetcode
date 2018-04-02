import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2017/10/8
 * Origin: https://leetcode.com/problems/pascals-triangle/description/
 */
public class LC0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                allRows.add(row);
                continue;
            }
            if (i == 2) {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                row.add(1);
                allRows.add(row);
                continue;
            }
            List<Integer> last_row = allRows.get(allRows.size() - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < last_row.size(); j++) {
                row.add(last_row.get(j - 1) + last_row.get(j));
            }
            row.add(1);
            allRows.add(row);
        }

        return allRows;
    }
}
