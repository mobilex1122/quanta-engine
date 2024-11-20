package eu.projnull.quanta;
import eu.projnull.quanta.utils.Color;
import eu.projnull.quanta.utils.Vector2;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Render {
    private boolean isBuffering = false;

    private RenderOptions options;

    private Vector2 cameraOffset;

    protected Render(RenderOptions options) {
        cameraOffset = new Vector2(0,0);
        this.options = options;
    }

    protected void startBuffering() {

    }


    private Vector2 world2GL(Vector2 pos) {

    }

    public void drawRect(Vector2 start, Vector2 end, Color color) {
        GL.createCapabilities();
        glBegin(GL_QUADS);
        glColor3b(color.getRed(), color.getGreen(), color.getBlue());
        glVertex2d(start.getX(),start.getY());
    }
}
