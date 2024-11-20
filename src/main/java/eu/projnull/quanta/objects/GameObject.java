package eu.projnull.quanta.objects;

import eu.projnull.quanta.Render;
import eu.projnull.quanta.utils.Vector2;

import java.util.ArrayList;


public abstract class GameObject {
    private Vector2 position;
    private ArrayList<GameObject> objects;


    private boolean disabled = false;

    public GameObject(Vector2 pos) {
        position = pos;
    }

    abstract void render(Render r);

    abstract boolean canRender();

    /**
     * Internal funtion that renders the object
     */
    protected void iternal_render(Render r) {
        for (GameObject o : objects) {
            render(r);
            if (!o.isDisabled() && o.canRender()) {
                o.iternal_render(r);
            }
        }

    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
