/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Circle extends Shape
/*    */ {
/*    */   private int radius;
/*    */   private Point center;
/*    */ 
/*    */   public Circle(Color fillColor, Color borderColor, int radius, int x, int y)
/*    */   {
/* 20 */     super(fillColor, borderColor, x, y);
/* 21 */     this.radius = radius;
/* 22 */     this.radius = radius;
/* 23 */     this.center = new Point(x + radius / 2, y + radius / 2);
/*    */   }
/*    */ 
/*    */   public Circle(Color fillColor, int radius, int x, int y) {
/* 27 */     super(fillColor, x, y);
/* 28 */     this.radius = radius;
/* 29 */     this.radius = radius;
/* 30 */     this.center = new Point(x + radius / 2, y + radius / 2);
/*    */   }
/*    */ 
/*    */   public Circle(int radius, int x, int y) {
/* 34 */     super(x, y);
/* 35 */     this.radius = radius;
/* 36 */     this.radius = radius;
/* 37 */     this.center = new Point(x + radius / 2, y + radius / 2);
/*    */   }
/*    */ 
/*    */   public void move()
/*    */   {
/* 42 */     super.move();
/* 43 */     this.center.setX(this.center.x() + dX());
/* 44 */     this.center.setY(this.center.y() + dY());
/*    */   }
/*    */ 
/*    */   public int getRadius()
/*    */   {
/* 52 */     return this.radius;
/*    */   }
/*    */ 
/*    */   public Point getCenter()
/*    */   {
/* 59 */     return this.center;
/*    */   }
/*    */ 
/*    */   public double getPerimeter()
/*    */   {
/* 65 */     return 6.283185307179586D * this.radius;
/*    */   }
/*    */ 
/*    */   public double getArea() {
/* 69 */     return 3.141592653589793D * Math.pow(this.radius, 2.0D);
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 74 */     return "Circle location: " + getLocation().toString();
/*    */   }
/*    */ 
/*    */   public void draw(Graphics g)
/*    */   {
/* 83 */     g.setColor(getBorderColor());
/* 84 */     g.drawOval(getX(), getY(), this.radius, this.radius);
/*    */ 
/* 87 */     g.setColor(getFillColor());
/* 88 */     g.fillOval(getX(), getY(), this.radius, this.radius);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 92 */     Shape circle = new Circle(Color.BLUE, 5, 10, 5);
/* 93 */     System.out.println(circle.getFillColor());
/* 94 */     System.out.println(circle);
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     Circle
 * JD-Core Version:    0.6.2
 */