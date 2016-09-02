
/**
 * Write a description of class RoverInformation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverInformation
{
   private String name;
   private int x;
   private int y;
   private int dir;
   private boolean isAlive = true;
   
   public RoverInformation(String name)
   {
       this.name = name;
   }
   
   public String toString()
    {
        return "Rover: name= " + name; 
    }
    
    
   //Directions
   public void move(int n)
   {
       if (isAlive)
       {
           if (dir == 0)
           {
               y += n;
           }
           else if (dir == 1)
           {
               x += n;
           }
           else if (dir == 2)
           {
               y -= n;
           }
           else
           {
               x -= n;
           }
           
           System.out.println(name + " moved " + getDirectionName(y));
        }
       else 
       {
           System.out.println(name + " can't move.");
       }
   }
   
   private String getDirectionName(int d)
   {
       if (d == 0)
       {
           return "North";
       }
       else if (d == 1)
       {
           return "East";
       }
       else if (d == 2)
       {
           return "South";
       }
       else 
       {
           return "West";
       }
   }

}
