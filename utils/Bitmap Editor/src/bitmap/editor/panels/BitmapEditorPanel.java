package bitmap.editor.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class BitmapEditorPanel extends JPanel implements MouseListener {
	public static int BOX_SIZE = 16;
	public boolean [] pixstatus;
	
	public int width;
	public int height;
	
	public BitmapEditorPanel (int width, int height) {
		this.width = width;
		this.height = height;
		this.pixstatus = new boolean [width * height];
		this.setPreferredSize(new Dimension(width * BOX_SIZE, height * BOX_SIZE));
	}
	
	public void paint (Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth (), getHeight ());
		
		g.setColor (Color.black);
		
		for (int x = 0; x < width; ++x) {
			for (int y = 0; y < height; ++y) {
				if (pixstatus [x + width * y])
					g.fillRect (x * BOX_SIZE, y * BOX_SIZE, BOX_SIZE, BOX_SIZE);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//TODO Implement BitmapEditorPanel.mouseClicked ()
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pixstatus [(e.getX () / BOX_SIZE) + width * (e.getY() / BOX_SIZE)] = 
				!pixstatus [(e.getX () / BOX_SIZE) + width * (e.getY() / BOX_SIZE)];
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
