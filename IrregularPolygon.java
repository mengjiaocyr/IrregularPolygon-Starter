import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool
public class IrregularPolygon{
  		private ArrayList <Point2D.Double> myPolygon;

// constructors
   		public IrregularPolygon() { }

// public methods
  		public void add(Point2D.Double aPoint) { }

   		public void draw() {
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            myDrawingTool.move(50, 50);
        }


   		public double perimeter() {
            return 0;
        }

   		public double area() {
            return 0;
        }
}
