/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

/**
 *
 * @author abuba
 */
import Example.*;
import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private TreeType type;
    private TreeSize size; // New attribute

    public Tree(int x, int y, TreeType type, TreeSize size) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.size = size;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y, size);
    }
}
