public class DogWalker {
    private int maxDogs;
    private DogWalkCompany company;
    private int walkerNumber;
    public DogWalker(int max, DogWalkCompany comp, int num) {
        maxDogs = max;
        company = comp;
        walkerNumber = num;
    }
    public int walkDogs(int hour) {
        int dogs = company.numAvaliableDogs(hour);
        if (dogs < maxDogs) {
            company.updateDogs(hour, dogs);
            return dogs;
        }
        else {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }
    public int dogWalkShift(int startHour, int endHour) {
        int pay = 0;
        while(startHour <= endHour) {
            int dogs = walkDogs(startHour);
            pay += dogs * 5;
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17) pay += 3;
            startHour ++;
        }
        return pay;
    }
    public String toString() {
        return "" + walkerNumber;
    }
}
