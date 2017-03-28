/*    */ import java.awt.Color;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Square extends Rectangle
/*    */ {
/*    */   public Square(Color fillColor, Color borderColor, int side, int x, int y)
/*    */   {
/* 16 */     super(fillColor, borderColor, side, side, x, y);
/*    */   }
/*    */ 
/*    */   public Square(Color fillColor, int side, int x, int y) {
/* 20 */     super(fillColor, side, side, x, y);
/*    */   }
/*    */ 
/*    */   public Square(int side, int x, int y) {
/* 24 */     super(side, side, x, y);
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 28 */     return "Square location: " + getLocation();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 32 */     Square sq = new Square(15, 10, 10);
/* 33 */     System.out.println(sq.getArea());
/* 34 */     System.out.println(sq);
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     Square
 * JD-Core Version:    0.6.2
 */