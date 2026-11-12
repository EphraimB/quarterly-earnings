
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HamburgerMenu extends JMenuBar {

    public HamburgerMenu() {
        // Creates the hamburger dropdown menu.
        JMenu menu = new JMenu("☰");

        // Creates the options for the hamburger menu to display.
        JMenuItem addcompany = new JMenuItem("Add a company");
        JMenuItem removecompany = new JMenuItem("Remove a company");
        

        // Adds the options to the menu.
        menu.add(addcompany);
        menu.add(removecompany);
        
        // Organize the menu options.
        menu.addSeparator();

        // Adds the completed hamburger menu to the menu bar.
        add(menu);
    }
    
}
