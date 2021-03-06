/*
* File: DrawFace.java
* -------------------
* This program draws a GFace in the middle of the screen. */
import acm.program.*;
import acm.graphics.*;
public class DrawFace extends GraphicsProgram {
    /** Width of face */
    private static final int FACE_WIDTH = 100;
    /** Height of face */
    private static final int FACE_HEIGHT = 200;

    @Override
    public void run() {
        GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT); add(face, (getWidth() - FACE_WIDTH) / 2,
                (getHeight() - FACE_HEIGHT) / 2);
    } }
