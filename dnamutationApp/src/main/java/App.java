
import com.hen.dnamutation.Controllers.DnaTesterController;
import com.hen.dnamutation.Views.DnaTester;
 

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class App {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DnaTester mainView = new DnaTester();
        DnaTesterController controller = new DnaTesterController(mainView); 
        java.awt.EventQueue.invokeLater(() -> {
            mainView.setVisible(true);
        });
    }
    
}
