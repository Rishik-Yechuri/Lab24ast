// Lab24ast.java
// This is the student version of the lab 24a assignment.

// Lab24ast.java
// This is the student version of the lab 24a assignment.


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Lab24ast {
    public static void main(String args[]) {
        GfxApp gfx = new GfxApp();
        gfx.setSize(1200, 900);
        gfx.addWindowListener(new WindowAdapter() {
            public void
            windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        gfx.show();
    }
}


class GfxApp extends Frame {
    public void paint(Graphics g) {
        ArrayList<RegPoly> holdPols = new ArrayList<>();
        holdPols.add(new RegPoly(60, 90, 90, 3, null, null));
        holdPols.add(new RegPoly(60, 220, 220, 4, null, null));
        holdPols.add(new RegPoly(60, 350, 350, 5, null, null));
        holdPols.add(new RegPoly(60, 480, 480, 6, null, null));
        holdPols.add(new RegPoly(60, 610, 610, 7, null, null));
        holdPols.add(new RegPoly(60, 740, 740, 8, null, null));
        for (int x = 0; x < holdPols.size(); x++) {
            holdPols.get(x).drawPoly(g);
        }
        /*RegPoly pol = new RegPoly(60,90,90,3,null,null);
        pol.drawPoly(g);*/
    }

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
                for (int p = 0; p < numOfPoints; p++) {
                    if (randomDegree > 359) {
                        randomDegree -= 360;
                    }
                    int endX = (int) (centerX + radius * Math.cos(Math.toRadians(randomDegree)));
                    int endY = (int) (centerY + radius * Math.sin(Math.toRadians(randomDegree)));
                    tempPolygon.addPoint(endX, endY);
                    System.out.println("steer:" + randomDegree);
                    randomDegree += (360 / numOfPoints);
                }
            }
            System.out.println("X vals:" + Arrays.toString(tempPolygon.xpoints));
            System.out.println("Y vals:" + Arrays.toString(tempPolygon.ypoints));
            g.fillPolygon(tempPolygon);
        }
    }

}
