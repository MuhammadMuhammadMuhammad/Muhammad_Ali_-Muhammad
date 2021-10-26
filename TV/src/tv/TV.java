
package tv;

public class TV 
{
    private int channel,volumeLevel;
    private boolean on;
    public TV()
    {
        
    }
    public void turnOn()
    {
        on=true;
    }
    public void turnOf()
    {
        on=false;
    }
    public  void setChannel(int newChannel)
    {
        if(newChannel>0&&newChannel<121)
            channel=newChannel;
        else
            System.out.println ("Incorrect channel!");
    }
    public void setVolume(int newVolumeLevel)
    {
        if(newVolumeLevel>=1&&newVolumeLevel<=7)
            volumeLevel=newVolumeLevel;
        else
            System.out.println("Incorrect volume");
    }
    public void channelUp()
    {
        if(channel==120)
            System.out.println("Out of range");
        else
            channel++;
    }
     public void channelDown()
    {
        if(channel==1)
            System.out.println("Out of range");
        else
            channel--;
    }
     
     public void volumeUp()
     {
         if(volumeLevel==7)
               System.out.println("Out of range");
         else
             volumeLevel++;
     }
     
       public void volumeDown()
     {
         if(volumeLevel==1)
               System.out.println("Out of range");
         else
             volumeLevel--;
     }

    public static void main(String[] args) 
    {
      
    }
    
}
