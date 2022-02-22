public class ParkingSystem
{
    private int _bigParkingTracker;
    private int _mediumParkingTracker;
    private int _smallParkingTracker;

    public ParkingSystem(int big, int medium, int small)
    {
        _bigParkingTracker = big;
        _mediumParkingTracker = medium;
        _smallParkingTracker = small;
    }

    public bool AddCar(int carType)
    {
        if (carType == 1)
        {
            if (_bigParkingTracker == 0) return false;
            _bigParkingTracker--;
            return true;
        }
        if (carType == 2)
        {
            if (_mediumParkingTracker == 0) return false;
            _mediumParkingTracker--;
            return true;
        }

        if (carType == 3)
        {
            if (_smallParkingTracker == 0) return false;
            _smallParkingTracker--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj.AddCar(carType);
 */