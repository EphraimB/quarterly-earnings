
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HamburgerMenu extends JMenuBar {

    public HamburgerMenu() {
        // Creates the hamburger drop down menu.
        JMenu menu = new JMenu("=");
        // Creates the options that the menu will display.
        JMenuItem addcompany = new JMenuItem("Add a company");
        JMenuItem removecompany = new JMenuItem("Remove a company");



        menu.add(addcompany);
        menu.add(removecompany);
        
    }
    
}
