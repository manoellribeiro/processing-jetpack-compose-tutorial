package manoellribeiro.dev.processingwithcompose;

import processing.core.PApplet;

public class MyJavaSketch extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            fill(23F, 234F, 40F);
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}