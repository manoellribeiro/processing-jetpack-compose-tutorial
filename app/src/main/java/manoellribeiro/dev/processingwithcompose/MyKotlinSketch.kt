package manoellribeiro.dev.processingwithcompose

import processing.core.PApplet

class MyKotlinSketch: PApplet() {
    override fun settings() {
        fullScreen()
    }

    override fun setup() {}

    override fun draw() {
        if (mousePressed) {
            fill(23F, 234F, 40F)
            ellipse(mouseX.toFloat(), mouseY.toFloat(), 50f, 50f)
        }
    }
}