/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Point
/*    */ {
/*    */   private int x;
/*    */   private int y;
/*    */ 
/*    */   public Point(int x, int y)
/*    */   {
/* 19 */     this.x = x;
/* 20 */     this.y = y;
/*    */   }
/*    */ 
/*    */   public int x()
/*    */   {
/* 25 */     return this.x;
/*    */   }
/*    */ 
/*    */   public int y()
/*    */   {
/* 30 */     return this.y;
/*    */   }
/*    */ 
/*    */   public void setX(int x) {
/* 34 */     this.x = x;
/*    */   }
/*    */ 
/*    */   public void setY(int y) {
/* 38 */     this.y = y;
/*    */   }
/*    */ 
/*    */   public double distanceTo(Point other)
/*    */   {
/* 43 */     double temp = Math.pow(this.x - other.x(), 2.0D) + Math.pow(this.y - other.y(), 2.0D);
/* 44 */     return Math.sqrt(temp);
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 49 */     return "(" + this.x + ", " + this.y + ")";
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 55 */     Point center = new Point(0, 0);
/* 56 */     Point p1 = new Point(5, 10);
/* 57 */     Point p2 = new Point(3, 7);
/*    */ 
/* 59 */     System.out.println(center.toString());
/* 60 */     System.out.println(p1.toString());
/*    */ 
/* 62 */     double d1 = center.distanceTo(p1);
/* 63 */     double d2 = p1.distanceTo(p2);
/*    */ 
/* 65 */     System.out.println(d1);
/* 66 */     System.out.println(d2);
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     Point
 * JD-Core Version:    0.6.2
 */