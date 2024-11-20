package eu.projnull.quanta;

public abstract class Engine
{

    private Render render;

    public Engine(RenderOptions renderOptions)
    {
        this.render = new Render(renderOptions);
    }

    public Engine getEngine() {
        return this;
    }
}
