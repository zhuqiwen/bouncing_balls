/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Rectangle extends Shape
/*    */ {
/*    */   private int width;
/*    */   private int length;
/*    */ 
/*    */   public Rectangle(Color fillColor, Color borderColor, int w, int l, int x, int y)
/*    */   {
/* 22 */     super(fillColor, borderColor, x, y);
/* 23 */     this.width = w;
/* 24 */     this.length = l;
/*    */   }
/*    */ 
/*    */   public Rectangle(Color c, int w, int l, int x, int y) {
/* 28 */     super(c, x, y);
/* 29 */     this.width = w;
/* 30 */     this.length = l;
/*    */   }
/*    */ 
/*    */   public Rectangle(int w, int l, int x, int y) {
/* 34 */     super(x, y);
/* 35 */     this.width = w;
/* 36 */     this.length = l;
/*    */   }
/*    */ 
/*    */   public double getPerimeter()
/*    */   {
/* 41 */     return 2 * this.width + 2 * this.length;
/*    */   }
/*    */ 
/*    */   public double getArea()
/*    */   {
/* 47 */     return this.length * this.width;
/*    */   }
/*    */ 
/*    */   public void draw(Graphics g)
/*    */   {
/* 56 */     g.setColor(getBorderColor());
/* 57 */     g.drawRect(getX(), getY(), this.width, this.length);
/*    */ 
/* 60 */     g.setColor(getFillColor());
/* 61 */     g.fillRect(getX(), getY(), this.width, this.length);
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 65 */     return "Rectangle location: " + getLocation().toString();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 69 */     Rectangle rect = new Rectangle(10, 8, 5, 5);
/* 70 */     System.out.println(rect);
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     Rectangle
 * JD-Core Version:    0.6.2
 */