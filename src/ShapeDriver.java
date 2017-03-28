/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.Timer;
/*     */ 
/*     */ public class ShapeDriver extends JPanel
/*     */   implements KeyListener, ActionListener
/*     */ {
/*  29 */   public final int FRAME_WIDTH = 600;
/*  30 */   public final int FRAME_HEIGHT = 600;
/*  31 */   public final int BORDER = 550;
/*     */   private List<Shape> shapes;
/*     */   private Random random;
/*     */   private Timer timer;
/*     */ 
/*     */   public ShapeDriver()
/*     */   {
/*  45 */     this.timer = new Timer(16, this);
/*  46 */     this.timer.start();
/*     */ 
/*  48 */     this.shapes = new ArrayList();
/*  49 */     this.random = new Random();
/*     */ 
/*  52 */     setPreferredSize(new Dimension(600, 600));
/*  53 */     setBackground(new Color(100, 160, 201));
/*  54 */     setFocusable(true);
/*     */ 
/*  57 */     addKeyListener(this);
/*     */   }
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/*  63 */     super.paintComponent(g);
/*     */ 
/*  65 */     for (Shape s : this.shapes)
/*  66 */       s.draw(g);
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/*  72 */     for (Shape s : this.shapes) {
/*  73 */       s.move();
/*  74 */       c = (Circle)s;
/*     */ 
/*  77 */       if (c.getX() + c.getRadius() >= 600)
/*  78 */         c.changeXDir();
/*  79 */       else if (c.getX() - c.getRadius() <= 0)
/*  80 */         c.changeXDir();
/*  81 */       else if (c.getY() - c.getRadius() <= 0)
/*  82 */         c.changeYDir();
/*  83 */       else if (c.getY() + c.getRadius() >= 600) {
/*  84 */         c.changeYDir();
/*     */       }
/*     */ 
/*  89 */       for (Shape s2 : this.shapes) {
/*  90 */         Circle c2 = (Circle)s2;
/*     */ 
/*  92 */         if (c.getCenter().distanceTo(c2.getCenter()) < c.getRadius() / 2 + c2.getRadius() / 2)
/*     */         {
/*  94 */           Color temp = c.getFillColor();
/*  95 */           c.setFillColor(c2.getFillColor());
/*  96 */           c2.setFillColor(temp);
/*     */ 
/*  98 */           c.changeXDir();
/*  99 */           c.changeYDir();
/*     */ 
/* 101 */           c2.changeXDir();
/* 102 */           c2.changeYDir();
/*     */         }
/*     */       }
/*     */     }
/*     */     Circle c;
/* 106 */     repaint();
/*     */   }
/*     */ 
/*     */   public void keyPressed(KeyEvent e)
/*     */   {
/* 111 */     int x = this.random.nextInt(550);
/* 112 */     int y = this.random.nextInt(550);
/* 113 */     Color c = RandomColor.getColor();
/* 114 */     boolean repaint = false;
/*     */ 
/* 116 */     if (e.getKeyCode() == 67) {
/* 117 */       this.shapes.add(new Circle(c, this.random.nextInt(25) + 5, x, y));
/* 118 */       repaint = true;
/*     */     }
/*     */ 
/* 135 */     if (repaint)
/* 136 */       repaint();
/*     */   }
/*     */ 
/*     */   public void keyReleased(KeyEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void keyTyped(KeyEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */   }
/*     */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     ShapeDriver
 * JD-Core Version:    0.6.2
 */