package bitmap.editor.panels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class SaveKeyListner implements KeyListener {
	public BitmapEditorPanel bep;

	public SaveKeyListner(BitmapEditorPanel bep) {
		this.bep = bep;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_S) {
			saveHexString();
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void saveHexString() {
		String fname = JOptionPane.showInputDialog("Enter filename: ");
		if (fname == null || fname.equals(""))
			return; // Handle the case where we don't enter anything into fname.
		if (fname.startsWith("{RES}")) {
			// TODO: MAke this more portable?
			fname = "../../res/" + fname.substring(5);
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					fname)));
			// Linearize pixbuf.
			int len = bep.pixstatus.length;
			if (len % 8 != 0)
				len += (len % 8) + 8; // Make sure we have enough bytes for all the
								// booleans.
			byte[] buff = new byte[(len / 8)];
			for (int i = 0; i < bep.pixstatus.length; ++i) {
				buff[i / 8] |= (bep.pixstatus[i]) ? (1 << (i % 8)) : 0;
			}
			// Get the byte order straight.
			reorder(buff);
			// Write the buffer out as as series of hex strings.
			for (int i = 0; i < buff.length; ++i) {
				bw.write("0x");
				bw.write(Integer.toHexString(0xFF & buff[i]));
				bw.write(", ");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Fixes the byte order of orig
	 * 
	 * @param orig
	 *            The buffer to fix
	 */
	private void reorder(byte[] orig) {
		for (int i = 0; i < orig.length; ++i) {
			// Fix the bit order.
			int b = 0xFF & orig[i];
			b = Integer.reverse(b);
			System.out.print (Integer.toHexString(b)); System.out.print(" ");
			b >>= 24; //Shift over back into byte space.
			System.out.println (Integer.toHexString(b));
			orig [i] = (byte)b;
		}
	}
}
