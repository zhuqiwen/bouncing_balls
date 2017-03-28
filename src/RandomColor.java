/*    */ import java.awt.Color;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class RandomColor
/*    */ {
/* 20 */   private static Random rand = new Random();
/*    */ 
/*    */   public static Color getColor()
/*    */   {
/* 25 */     float r = rand.nextFloat();
/* 26 */     float g = rand.nextFloat();
/* 27 */     float b = rand.nextFloat();
/*    */ 
/* 29 */     return new Color(r, g, b);
/*    */   }
/*    */ }

/* Location:           /Users/zqw/Downloads/lab9.jar
 * Qualified Name:     RandomColor
 * JD-Core Version:    0.6.2
 */