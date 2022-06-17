import java.util.;
public class PascalsTriangle2 {
  public static int[][] pascal(int depth) {
       
  ArrayListArrayListInteger allrows = new ArrayListArrayListInteger();
  ArrayListInteger row = new ArrayListInteger();
  for(int i=0;idepth;i++)
  {
    row.add(0, 1);
    for(int j=1;jrow.size()-1;j++)
      row.set(j, row.get(j)+row.get(j+1));
    allrows.add(new ArrayListInteger(row));
  }
            
int[][] ints = allrows.stream().map(x - x.stream().mapToInt(IntegerintValue).toArray()).toArray(int[][]new); 

        return ints;
    }
}