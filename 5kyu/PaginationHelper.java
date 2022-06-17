import java.util.List;
import java.util.ArrayList;

// TODO: complete this object/class

public class PaginationHelper<I> {

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  List<I> list = new ArrayList<I>();
  int perPage = 0;
  
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    list = collection;
    perPage = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return list.size();
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    int count = list.size() / perPage;
    if((count * perPage) == list.size())
      return count;
    else
      return count + 1;
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    System.out.println(pageIndex + " " + perPage + " " + list.size());
    int temp = perPage * pageCount() - list.size();
    
    
      if(pageIndex > pageCount()-1) return -1;
      else if(pageIndex == pageCount() - 1)
        return perPage - temp;
      else
        return perPage;
    }
  
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    System.out.println(itemIndex + " " + perPage + " " + list.size());
    if(list.size() == 0)
      return -1;
    else if(itemIndex == 0) return 0;
    else if(itemIndex < 0) return -1;
    else if (perPage % itemIndex == 0)
      return (itemIndex / perPage) - 1;
    else if (itemIndex > itemCount())
      return -1;
    else
      return (itemIndex / perPage);
    
  }
}