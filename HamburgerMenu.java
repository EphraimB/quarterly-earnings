
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HamburgerMenu extends JMenuBar {

    public HamburgerMenu() {
<<<<<<< HEAD
        // Creates the hamburger drop down menu.
        JMenu menu = new JMenu("=");
        // Creates the options that the menu will display.
=======
        JMenu menu = new JMenu("☰");

>>>>>>> 49aeb86a1104e88c72b0b927dadfc66fd5315df0
        JMenuItem addcompany = new JMenuItem("Add a company");
        JMenuItem removecompany = new JMenuItem("Remove a company");



        menu.add(addcompany);
        menu.add(removecompany);
        
    }
    
}
