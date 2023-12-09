/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

import Example.*;
import java.awt.Color;

/**
 *
 * @author abuba
 */
public class Demo {

static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
       for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            int x = random(0, CANVAS_SIZE);
            int y = random(0, CANVAS_SIZE);

            // Determine the size based on the y-coordinate
            TreeSize size;
            if (y < CANVAS_SIZE / 3) {
                size = TreeSize.LARGE;
            } else if (y < 2 * CANVAS_SIZE / 3) {
                size = TreeSize.MEDIUM;
            } else {
                size = TreeSize.SMALL;
            }

            forest.plantTree(x, y, "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(x, y, "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }}
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
