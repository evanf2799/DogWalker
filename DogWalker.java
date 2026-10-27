public class DogWalker {
    private int maxDogs;
    private DogWalkCompany company;
    public DogWalker(int max, DogWalkCompany comp) {
        maxDogs = max;
        company = comp;
    }
    public int walkDogs(int hour) {
        int dogs = company.numAvaliableDogs(hour);
    }
    public int dogWalkShift(int startHour, int endHour) {
        
    }
}
