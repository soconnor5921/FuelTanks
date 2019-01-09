import java.util.ArrayList;
import java.util.List;

public class FuelDepot
{
    private FuelRobot filler;
    private List<FuelTank> tanks = new ArrayList<FuelTank>();

    public int nextTankToFill(int threshold)
    {
        int lowest = 0;
        for(int i = 0; i < tanks.size(); i++)
        {
            
        }
    }

    public void moveToLocation(int locIndex)
    {
        int currentIndex = filler.getCurrentIndex();
        if(filler.isFacingRight())
        {
            if(currentIndex - locIndex > 0)
            {
                filler.changeDirection();
            }
        }
        else
        {
            if(currentIndex - locIndex < 0)
            {
                filler.changeDirection();
            }
            filler.moveForward(Math.abs(currentIndex - locIndex));
        }
    }
}
