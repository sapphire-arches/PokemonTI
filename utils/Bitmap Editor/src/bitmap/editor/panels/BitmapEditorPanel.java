package bitmap.editor.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class BitmapEditorPanel extends JPanel implements MouseListener, MouseMotionListener {
	public int boxSize = 16;
	public boolean[] pixstatus;

	public int width;
	public int height;
	
	public int mx,my,mb;

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
		mb = e.getButton();
		if (mb == MouseEvent.BUTTON2)
			pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = true;
		else if (mb == MouseEvent.BUTTON3)
			pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = false;
		else
			pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = !pixstatus[(e
				.getX() / boxSize) + width * (e.getY() / boxSize)];
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (e.getX () < 0 || e.getX () >= width || e.getY () < 0 || e.getY () >= height) //make sure we don't write out of range values.
			return;
		if (mb == MouseEvent.BUTTON2)
			pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = true;
		else if (mb == MouseEvent.BUTTON3)
			pixstatus[(e.getX() / boxSize) + width * (e.getY() / boxSize)] = false;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
