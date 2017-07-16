
package rubiks_cube;

/**
 *
 * @author Cole Aronson
 * Function: A cube that is made up of sides.
 */
public class Cube {
    public Cube()
    {
        //create sides
        int [ ] [ ] right = new int [ 3 ] [ 3];
        int [ ] [ ] left = new int [ 3 ] [ 3];
        int [ ] [ ] up = new int [ 3 ] [ 3];
        int [ ] [ ] back = new int [ 3 ] [ 3];
        int [ ] [ ] down = new int [ 3 ] [ 3];
        int [ ] [ ] front = new int [ 3 ] [ 3];
        //**how do I assign a value to whole matrix? Nested for?
        for (int i = 0; i < 3; i++) {
            
        }
        
        Turns turn = new Turns();
        //**need to make sure all sides are available so it is actually solvable. probably create a solved cube
    }
    
    //shuffles cube
    public static void shuffle(Cube this)
    {
        
    }
    
    public static void solve(Cube this)
    {
        
    }
    
    //not sure if I created the correct return
    //white cross
    public static step1(Cube this)
    {
        
    }

    //white corners
    public static step2(Cube this)
    {
        
    }
    
    //middle layer
    public static step3(Cube this)
    {
        
    }
    
    //top face
    public static step4(Cube this)
    {
        
    }
    
    //last layer
    public static step5(Cube this)
    {
        
    }
    
    public static String toString()
    {
        String output;
        
        return output;
    }
}
