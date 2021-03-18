public class LandPlot {
    private final long width;
    private final long length;
    private final long cost;

    public LandPlot(long width, long length, long cost) {
        this.width = width;
        this.length = length;
        this.cost = cost;
    }

    public long getCost() {
        return cost;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    public String toString() {
        return "Участок: ширина " + getWidth() + ", длина " + getLength() + ", стоимость за 1 кв.метр " + getCost();
    }
}
