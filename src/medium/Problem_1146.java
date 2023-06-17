package medium;


import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Problem_1146 {

}
class SnapshotArray {
    private final Map<Integer, TreeMap<Integer, Integer>> arraySnapshots;
    private int snapId;

    public SnapshotArray(int length) {
        arraySnapshots = new HashMap<>();
        snapId = 0;
        for (int i = 0; i < length; i++) {
            arraySnapshots.put(i, new TreeMap<>());
        }
    }

    public void set(int index, int val) {
        arraySnapshots.get(index).put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        if (arraySnapshots.get(index).floorEntry(snap_id) == null) {
            return 0;
        }
        return arraySnapshots.get(index).floorEntry(snap_id).getValue();
    }
}
