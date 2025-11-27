public class arrayofparentandchildclasses {
  public static void main(String[] args) {
    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
// The array declaration for child classes is under here:        
    Noodle[] allTheNoodles = {spaghetti, ramen, pho};
    for(Noodle noodle: allTheNoodles){
      System.out.println(noodle.getCookPrep());
    }   
  }
}
