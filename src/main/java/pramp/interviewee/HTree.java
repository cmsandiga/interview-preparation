package pramp.interviewee;

import javax.swing.*;
import java.awt.*;

/**
 * Created by makoto on 04/03/17.
 H-Tree Construction

 Construct an H-tree, given its center (x and y coordinates), starting_length and depth. You can assume that you have a drawLine method.

 As a reminder, this is an example of an H-tree.

 How to construct an H-tree?

 An H-tree can be constructed by starting with a line segment of arbitrary length, drawing two segments of the same length at right angles to the first through its endpoints, and continuing in the same vein, reducing (dividing) the length of the line segments drawn at each stage by √2.
 */
public class HTree extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        int x = 400;
        int y = 400;
        int depth = 2;
        int startpoint = 200;


        drawHTree(x, y, depth, startpoint, g);
    }

    private void drawHTree(int x, int y, int depth, int startpoint, Graphics g) {

        if (depth <= 0) {
            return;
        }

        int move = startpoint / 2;
        drawline(x - move, y, x + move, y, g); // baseline
        drawline(x - move, y + move, x - move, y - move, g);
        drawline(x + move, y + move, x + move, y - move, g);

        int newstart = startpoint / 2;

        drawHTree(x - move, y + move, depth - 1, newstart, g);
        drawHTree(x - move, y - move, depth - 1, newstart, g);
        drawHTree(x + move, y + move, depth - 1, newstart, g);
        drawHTree(x + move, y - move, depth - 1, newstart, g);
    }

    public void drawline(int x1, int y1, int x2, int y2, Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.drawLine(x1, y1, x2, y2);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HTree game = new HTree();
        frame.setContentPane(game);

        frame.setVisible(true);
    }


}
