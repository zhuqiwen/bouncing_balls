/*    */ import java.awt.BorderLayout;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class ShapeWindow extends JFrame
/*    */ {
/*    */   JPanel shapeDriver;
/*    */ 
/*    */   public ShapeWindow()
/*    */   {
/* 23 */     this.shapeDriver = new ShapeDriver();
/*    */ 
/* 26 */     setTitle("Random Shapes");
/* 27 */     setLayout(new BorderLayout());
/* 28 */     add(this.shapeDriver, "Center");
/* 29 */     pack();
/* 30 */     setVisible(true);
/* 31 */     setDefaultCloseOperation(3);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 35 */     JFrame shapeWindow = new ShapeWindow();
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     ShapeWindow
 * JD-Core Version:    0.6.2
 */