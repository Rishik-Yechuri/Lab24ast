/*
import java.awt.*;
import java.util.Arrays;

public class RegPoly {
    int radius;
    int centerX;
    int centerY;
    int numOfPoints;
    int[] xCords;
    int[] yCords;

    public RegPoly(int radius, int centerX, int centerY, int numOfPoints, int[] xCords, int[] yCords) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.numOfPoints = numOfPoints;
        this.xCords = xCords;
        this.yCords = yCords;
    }

    public void drawPoly(Graphics g) {
        Polygon tempPolygon = new Polygon();
        if (xCords != null) {
            for (int x = 0; x < numOfPoints; x++) {
                //tempPolygon.addPoint(xCords[x], yCords[x]);
            }
        } else {
            int randomDegree = (int) (Math.random() * 360);
            for(int p=0;p<numOfPoints;p++){
                if(randomDegree > 359){randomDegree-=360;}
                int endX = (int) (centerX + radius * Math.cos(Math.toRadians(randomDegree)));
                int endY = (int) (centerY + radius * Math.sin(Math.toRadians(randomDegree)));
                tempPolygon.addPoint(endX,endY);
                System.out.println("steer:" + randomDegree);
                randomDegree+=(360/numOfPoints);
            }
        }
        System.out.println("X vals:" + Arrays.toString(tempPolygon.xpoints));
        System.out.println("Y vals:" + Arrays.toString(tempPolygon.ypoints));
        g.fillPolygon(tempPolygon);
    }
}
*/
