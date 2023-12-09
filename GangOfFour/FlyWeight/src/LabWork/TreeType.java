/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

import Example.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author abuba
 */
import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y, TreeSize size) {
        // Draw the tree trunk
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        // Draw the tree
        if (isFruitTree) {
            // If it's a fruit tree, use a slightly different color
            g.setColor(color.darker()); // Use a slightly darker color for fruit trees
        } else {
            g.setColor(color);
        }

        int treeSizeFactor = size == TreeSize.SMALL ? 1 : (size == TreeSize.MEDIUM ? 2 : 3);

        g.fillOval(x - 5 * treeSizeFactor, y - 10 * treeSizeFactor, 10 * treeSizeFactor, 10 * treeSizeFactor);

        // Additional drawing logic for fruits if it is a fruit tree
        if (isFruitTree) {
            g.setColor(Color.RED); // You can change the color for fruits
            for (int i = 0; i < countOfFruits; i++) {
                int fruitX = x + i * 5 * treeSizeFactor; // Adjust the position of each fruit
                int fruitY = y - 15 * treeSizeFactor;    // Adjust the height of fruits
                g.fillOval(fruitX - 2, fruitY, 4 * treeSizeFactor, 4 * treeSizeFactor); // Draw a simple oval for each fruit
            }
        }
    }
}
