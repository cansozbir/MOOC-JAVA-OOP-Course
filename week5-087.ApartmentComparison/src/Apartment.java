
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger ( Apartment otherApartment) {
        if (this.squareMeters>otherApartment.squareMeters)
                    return  true;

        else
            return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int p1 = this.pricePerSquareMeter * this.squareMeters;
        int p2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (p1>p2)
            return p1-p2 ;
        else
            return p2-p1;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int p1 = this.pricePerSquareMeter * this.squareMeters;
        int p2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (p1>p2)
            return true;
        else
            return false;
    }
}
