package item;

import user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemPoints {
    private List<Point> points;

    public ItemPoints(List<Point> points) {
        if (points != null) {
            this.points = points;
        } else {
            this.points = new ArrayList<Point>();
        }
    }

    public int getPointCount() {
        return this.points.size();
    }

    public double getAveragePoint() {
        int size = this.points.size();
        double sum = 0;
        for (Point point : this.points) {
            sum += point.getValue();
        }
        return sum / size;
    }

    public List<Point> findPoints(User user) {
        List<Point> foundPoints = new ArrayList<Point>();
        for (Point point : this.points) {
            if (point.getSender().equals(user)) foundPoints.add(point);
        }
        return foundPoints;
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public void removePoint(Point point) {
        this.points.remove(point);
    }

    public void addPoints(List<Point> points) {
        this.points.addAll(points);
    }

    public List<Point> getPoints() {
        return this.points;
    }


}
