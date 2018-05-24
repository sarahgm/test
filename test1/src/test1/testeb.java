package test1;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class testeb extends JFrame{
	public static void main (String[] args) {
		
		Feldeinstellungen();
		
	}
	private static void Feldeinstellungen() {
		JFrame fenster = new JFrame("Schiffeversenken");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(500, 400);
		fenster.setLayout(new GridBagLayout());
		
		
		JButton button = new JButton("");
		JPanel panel = new JPanel();
//		for(int i = 0; i <=5; i++ ) {
//			for( int j = 0; j <=5; j++) {
//				panel[i][j].add(button[i][j]);
//			}
		
			GridBagConstraints c = new GridBagConstraints();

			c.fill = GridBagConstraints.HORIZONTAL;
			c.insets = new Insets(0,0,0,0);

			c.gridx = 0;
			c.gridy = 0;
			fenster.getContentPane().add(button, c);

			fenster.setVisible(true);
		}
		

	}

	


