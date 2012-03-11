package bitmap.editor.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class BitmapEditorPanel extends JPanel implements MouseListener {
	public int boxSize = 16;
	public boolean[] pixstatus;

	public int width;
	public int height;

	public BitmapEditorPanel(int width, int height, int boxSize) {
		this.width = width;
		this.height = height;
		this.boxSize = boxSize;
		this.pixstatus = new boolean[width * height];
		this.setPreferredSize(new Dimension(width * boxSize, height * boxSize));
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.black);

		for (int x = 0; x < width; ++x) {
			for (int y = 0; y < height; ++y) {
				if (pixstatus[x + width * y])
					g.fillRect(x * boxSize, y * boxSize, boxSize, boxSize);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Implement BitmapEditorPanel.mouseClicked ()
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
		pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = !pixstatus[(e
				.getX() / boxSize) + width * (e.getY() / boxSize)];
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
