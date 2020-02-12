
package bolentin17_1;

/**
 * @author Guillermo
 */
public class Gato extends Mamiferos implements IPuedeNadar{
    
    @Override
    public void nadar(){
        System.out.println("Los gatos pueden nadar");
    }
}
