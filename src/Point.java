public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }



    public boolean isOrigin(Point a){
        boolean origin = false;
        if (this.x == 0 && this.y == 0){
            origin = true;
        }
        return origin;
    }




    double distance(Point other){
        double dX = this.x - other.x;
        double dXSquare = dX * dX;

        double dY = this.y - other.y;
        double dYSquare = dY * dY;

        double sum = dXSquare + dYSquare;

        double disSquareRoot = Math.sqrt(sum);

        return disSquareRoot;
    }




}
