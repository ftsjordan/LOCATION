package Interface_Graphique;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class toolbar extends JFrame{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public toolbar() {
		super("Barre_de_menu");
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel contentpane=(JPanel) this .getContentPane();
		contentpane.add(createToolbar(), BorderLayout.NORTH);
	
	}
	
// creation de la barre d'outils
	
private JToolBar createToolbar() {
	
	JToolBar menu =new JToolBar();
	JButton boutton1= new JButton("Gestion de propriete");
	JButton boutton2= new JButton("Gestion de locataire");
	JButton boutton3= new JButton("Calcul de sous-facture");
	
	menu.add(boutton1);
	menu.add(boutton2);
	menu.add(boutton3);
		return menu;
	}
	
	
	

public void action_de_fichier(ActionEvent e)
{
	JOptionPane.showMessageDialog(null, this, "document enregidtrer", 0);
}

public static void main(String[] args) throws Exception {
	
	 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	 
	toolbar b = new toolbar();
	 b.setVisible(true);
}}



