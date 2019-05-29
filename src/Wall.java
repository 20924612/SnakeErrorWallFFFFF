
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author K501U
 */
public class Wall {

    public List<Node> list;

    public Wall() {
        list = new ArrayList<Node>();
    }

    public void createWall() {
        switch (Config.getInstance().getLevel()) {
            case 3:
                list.add(new Node(12, 5));
                list.add(new Node(12, 6));
                list.add(new Node(12, 7));
                list.add(new Node(12, 8));
                list.add(new Node(13, 5));
                list.add(new Node(13, 6));
                list.add(new Node(13, 7));
                list.add(new Node(13, 8));
                list.add(new Node(14, 5));
                list.add(new Node(14, 6));
                list.add(new Node(14, 7));
                list.add(new Node(14, 8));
                list.add(new Node(15, 5));
                list.add(new Node(15, 6));
                list.add(new Node(15, 7));
                list.add(new Node(15, 8));
            case 2:
                list.add(new Node(5, 32));
                list.add(new Node(5, 33));
                list.add(new Node(5, 34));
                list.add(new Node(5, 35));
                list.add(new Node(6, 32));
                list.add(new Node(6, 33));
                list.add(new Node(6, 34));
                list.add(new Node(6, 35));
                list.add(new Node(7, 32));
                list.add(new Node(7, 33));
                list.add(new Node(7, 34));
                list.add(new Node(7, 35));
                list.add(new Node(8, 32));
                list.add(new Node(8, 33));
                list.add(new Node(8, 34));
                list.add(new Node(8, 35));
            case 1:
                list.add(new Node(12, 32));
                list.add(new Node(12, 33));
                list.add(new Node(12, 34));
                list.add(new Node(12, 35));
                list.add(new Node(13, 32));
                list.add(new Node(13, 33));
                list.add(new Node(13, 34));
                list.add(new Node(13, 35));
                list.add(new Node(14, 32));
                list.add(new Node(14, 33));
                list.add(new Node(14, 34));
                list.add(new Node(14, 35));
                list.add(new Node(15, 32));
                list.add(new Node(15, 33));
                list.add(new Node(15, 34));
                list.add(new Node(15, 35));
            case 0:
                list.add(new Node(5, 5));
                list.add(new Node(5, 6));
                list.add(new Node(5, 7));
                list.add(new Node(5, 8));
                list.add(new Node(6, 5));
                list.add(new Node(6, 6));
                list.add(new Node(6, 7));
                list.add(new Node(6, 8));
                list.add(new Node(7, 5));
                list.add(new Node(7, 6));
                list.add(new Node(7, 7));
                list.add(new Node(7, 8));
                list.add(new Node(8, 5));
                list.add(new Node(8, 6));
                list.add(new Node(8, 7));
                list.add(new Node(8, 8));

                break;
        }
    }

    public void drawWall(Graphics g, int height, int width) {
        for (Node node : list) {
            Util.drawSquare(g, node.row, node.col, Color.gray, width / Board.NUM_COLS, height / Board.NUM_ROWS);
        }
    }
}
