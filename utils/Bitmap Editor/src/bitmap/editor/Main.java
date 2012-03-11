package bitmap.editor;

import javax.swing.JFrame;

import bitmap.editor.panels.BitmapEditorPanel;
import bitmap.editor.panels.SaveKeyListner;

public class Main {
	public static void main (String [] args) throws InterruptedException {
		JFrame frame = new JFrame ();
		BitmapEditorPanel b;
		if (args.length < 0) 
			b = new BitmapEditorPanel(16, 16);
		else
			b = new BitmapEditorPanel (Integer.parseInt (args [0]), Integer.parseInt (args [1]));
		frame.getContentPane().add(b);
		frame.getContentPane().addMouseListener(b);
		frame.addKeyListener(new SaveKeyListner(b));
		frame.pack ();
		frame.setResizable(false);
		frame.setVisible (true);
		
		while (true) {
			frame.repaint ();
			Thread.sleep(10);
		}
	}
}
