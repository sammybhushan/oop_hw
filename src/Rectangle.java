public class Rectangle implements Glyph{
    private Glyph parent;
    private Bounds bounds;

    private int height;
    private int width;
    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
        bounds = new Bounds();
    }
    @Override
    public void draw(Window window) {
        window.drawRectangle(bounds.xS, bounds.yS, this.width,this.height);
    }

    @Override
    public void insert(Glyph newGlyph, int index) {
        try {
            throw new Exception("Invalid Insert");
        }catch(Exception E){
            System.out.println("Cannot insert into rect glyph");
        }
    }
    @Override
    public void remove(Glyph glyph){
        try {
            throw new Exception("Invalid Remove");
        }catch(Exception E){
            System.out.println("Cannot remove from rect glyph");
        }
    }
    @Override
    public Glyph getChild(int index){
        try {
            throw new Exception("Invalid");
        }catch(Exception E){
            System.out.println("Cannot get child from char glyph");
        }
        return null;
    }
    @Override
    public void compose(){
        try {
            throw new Exception("Invalid");
        }catch(Exception E){
            System.out.println("Cannot get child from char glyph");
        }
    }
    @Override
    public Glyph getParent(){
        return this.parent;
    }
    @Override
    public void setParent(Glyph parent){
        this.parent = parent;
    }
    @Override
    public void setPosition(Bounds cursor) {
        // take the starting x,y location and set bounds accordingly
        this.bounds.xS = cursor.xS;
        this.bounds.yS = cursor.yS;
        this.bounds.xE = cursor.xS + this.height;
        this.bounds.yE = cursor.yS + this.width;
        cursor.xS = this.bounds.xE;
    }

    @Override
    public Bounds getBounds() {
        return bounds;
    }
}
