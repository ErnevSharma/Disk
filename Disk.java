import java.awt.Color;
import java.awt.Graphics;

class Disk 
{
   int diskSize;
   
   static final int HEIGHT = 20;
   static final int WIDTH_STEP = 20;
   static final int ARC_WIDTH = 5;
   static final int ARC_HEIGHT = 5;
  
   static final Color[] DISK_COLORS = {
                           Color.black,
                           Color.red,
                           Color.blue,
                           Color.yellow,
                           Color.green,
                           Color.orange,
                           Color.magenta,
                           Color.gray,
                           Color.pink 
                  };
   //-----------------------------------------------------------------
   //  Creates a disk of specified size
   //-----------------------------------------------------------------
   Disk(int size)
   {
      diskSize = size;
   }

   //-----------------------------------------------------------------
   //  Returns the size of the disk
   //-----------------------------------------------------------------
   int getSize()
   {
        return diskSize;
   }

   //-----------------------------------------------------------------
   //  Returns the width of the disk to be drawn on the screen
   //-----------------------------------------------------------------
   int getScreenWidth()
   {
       return diskSize * WIDTH_STEP;
   }
   
   //-----------------------------------------------------------------
   //  Returns the color of the disk as indexed in DISK_COLORS
   //-----------------------------------------------------------------
   Color getDiskColor()
   {
      return DISK_COLORS[diskSize % DISK_COLORS.length];
   }

   //-----------------------------------------------------------------
   //  Draws the disk using graphics context g.  Position x 
   //  represents the x coordinate of the center of the tower, 
   //  position y represents the top position of the disk on the tower
   //-----------------------------------------------------------------
   void draw(Graphics g, int x, int y)
   {
       int width = getScreenWidth();
       int diskX = x - width / 2;
       g.setColor(getDiskColor());
       g.fillRoundRect(diskX, y, width, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
       g.setColor(Color.black);
       g.drawRoundRect(diskX, y, width, HEIGHT, ARC_WIDTH, ARC_HEIGHT);

   }

}
