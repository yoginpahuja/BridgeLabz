
import java.util.*;
class FlipCoin{
    public static void main(String[] args)
    {
      Scanner scanObj = new Scanner (System.in);
      System.out.println("Enter the number of flips");
      int flips=scanObj.nextInt();
      int temp=flips;
      int head=0,tail=0;
      while(temp>0)
        {
          double hOrT=Math.random();
          if(hOrT>0.5)
           tail++;
          else
           head++;
          temp--;
        }
      System.out.println("Percentage of Head is " + head*1.0/flips);
      System.out.println("Percentage of Tail is " + tail*1.0/flips);
    }
}