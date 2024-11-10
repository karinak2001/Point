public class Line {
    private Point start;
    private Point end;
    private String color;

    public Line(Point start, Point end, String color){
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
