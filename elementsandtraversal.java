import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    for (int i = 0; i < lunchBox.size(); i++) {
      if (lunchBox.get(i) == "ant"){
        lunchBox.remove(lunchBox.get(i));
        i--;    
      }
    }

   /*
    // Using a while loop
    int i = 0; 
    while (i < lunchBox.size()) {
      if (lunchBox.get(i) == "ant"){
        lunchBox.remove(lunchBox.get(i));
      } else {
        i++;
      }
    }
   */

    return lunchBox;
  }
 
  
