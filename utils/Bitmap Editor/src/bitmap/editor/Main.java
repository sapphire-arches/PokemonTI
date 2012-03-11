package bitmap.editor;

import javax.swing.JFrame;

import bitmap.editor.panels.BitmapEditorPanel;
import bitmap.editor.panels.SaveKeyListner;

public class Main {
	public static int w = 16;
	public static int h = 16;
	public static int s = 16;

	public static void parseArgs(String[] args) {
		for (int i = 0; i < args.length; ++i) {
			if (args[i].startsWith("-w")) {
				w = Integer.parseInt(args[i].substring(2));
			} else if (args[i].startsWith("-h")) {
				h = Integer.parseInt(args[i].substring(2));
			} else if (args[i].startsWith("-b")) {
				s = Integer.parseInt(args[i].substring(2));
			} else {
				System.out.println("Usage: ");
				System.out
						.println("java -jar Bitmap\\ Editor.jar [-b<Draw size>] [-w<WIDTH IN PIXELS>] [-h<HEIGHT IN PIXELS>]");
				System.exit(1);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		parseArgs(args);
		JFrame frame = new JFrame();
		BitmapEditorPanel b = new BitmapEditorPanel(w, h, s);
		frame.getContentPane().add(b);
		frame.getContentPane().addMouseListener(b);
		frame.addKeyListener(new SaveKeyListner(b));
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		while (true) {
			frame.repaint();
			Thread.sleep(10);
		}
	}
}
