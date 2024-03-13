public class Scroller extends Embellishment{

    int width;
    public Scroller(Compositor compositor,int width) {
        super(compositor);
        this.width = width;
    }

    @Override
    public void draw(Window window) {
//        this.children.get(0).draw(window); //draw child???
        window.addScrollBar(bounds.xS, bounds.yS, width, bounds.yE-bounds.yS);
    }

    @Override
    public void setCursor(Bounds cursor) {

    }
}
