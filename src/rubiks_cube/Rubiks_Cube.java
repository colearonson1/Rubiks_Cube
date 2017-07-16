
package rubiks_cube;
/**
 *
 * @author Cole Aronson
 */
public class Rubiks_Cube {

    public static void main(String[] args) {
      //creates a cube
      Cube rubiks = new Cube();
      rubiks.shuffle();
      rubiks.solve();
      rubiks.toString();
      //
    
    }
    
}
