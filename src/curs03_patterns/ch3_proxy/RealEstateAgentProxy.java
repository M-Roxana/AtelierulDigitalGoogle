package curs03_patterns.ch3_proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    List<Apartment> apartments;

    public RealEstateAgentProxy() {
        this.apartments = new ArrayList<>();
    }

    public void represent(Apartment apartment) {

        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        Apartment rentedApartment = null;

        if (!student.getName().toLowerCase().startsWith("p")) {
            for (Apartment apartment : apartments) {
                rentedApartment = apartment;
                apartments.remove(apartment);
                return rentedApartment;
            }
        }
        return  null;
    }
}
