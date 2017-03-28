/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ 
/*     */ abstract class Shape
/*     */ {
/*     */   private Color color;
/*     */   private Color borderColor;
/*     */   private boolean isFilled;
/*     */   private Point location;
/*  21 */   private int dX = 1;
/*  22 */   private int dY = 1;
/*     */ 
/*     */   public Shape(Color fillColor, Color borderColor, int x, int y)
/*     */   {
/*  32 */     this(fillColor, x, y);
/*  33 */     this.borderColor = borderColor;
/*     */   }
/*     */ 
/*     */   public Shape(Color fillColor, int x, int y)
/*     */   {
/*  43 */     this.isFilled = true;
/*  44 */     this.color = fillColor;
/*  45 */     this.borderColor = Color.BLACK;
/*  46 */     this.location = new Point(x, y);
/*     */   }
/*     */ 
/*     */   public Shape(int x, int y)
/*     */   {
/*  55 */     this.color = Color.WHITE;
/*  56 */     this.borderColor = Color.BLACK;
/*  57 */     this.isFilled = false;
/*  58 */     this.location = new Point(x, y);
/*     */   }
/*     */ 
/*     */   public void setFillColor(Color c)
/*     */   {
/*  67 */     if (c == Color.WHITE) {
/*  68 */       this.isFilled = false;
/*     */     }
/*  70 */     this.color = c;
/*  71 */     this.isFilled = true;
/*     */   }
/*     */ 
/*     */   public Color getFillColor()
/*     */   {
/*  79 */     return this.color;
/*     */   }
/*     */ 
/*     */   public void setBorderColor(Color c)
/*     */   {
/*  87 */     this.borderColor = c;
/*     */   }
/*     */ 
/*     */   public Color getBorderColor()
/*     */   {
/*  95 */     return this.borderColor;
/*     */   }
/*     */ 
/*     */   public Point getLocation()
/*     */   {
/* 103 */     return this.location;
/*     */   }
/*     */ 
/*     */   public int getX()
/*     */   {
/* 111 */     return this.location.x();
/*     */   }
/*     */ 
/*     */   public int getY()
/*     */   {
/* 119 */     return this.location.y();
/*     */   }
/*     */ 
/*     */   public void changeXDir()
/*     */   {
/* 125 */     this.dX *= -1;
/*     */   }
/*     */ 
/*     */   public void changeYDir()
/*     */   {
/* 130 */     this.dY *= -1;
/*     */   }
/* 132 */   public int dX() { return this.dX; } 
/*     */   public int dY() {
/* 134 */     return this.dY;
/*     */   }
/*     */ 
/*     */   public boolean isFilled()
/*     */   {
/* 142 */     return this.isFilled;
/*     */   }
/*     */ 
/*     */   public void move()
/*     */   {
/* 147 */     this.location.setX(this.location.x() + this.dX);
/* 148 */     this.location.setY(this.location.y() + this.dY);
/*     */   }
/*     */ 
/*     */   abstract double getPerimeter();
/*     */ 
/*     */   abstract double getArea();
/*     */ 
/*     */   abstract void draw(Graphics paramGraphics);
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */   }
/*     */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     Shape
 * JD-Core Version:    0.6.2
 */