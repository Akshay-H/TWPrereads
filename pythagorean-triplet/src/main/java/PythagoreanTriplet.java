import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {

    private final int a;

    private final int b;

    private final int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static TripletBuilder makeTripletsList() {
        return new TripletBuilder();
    }

    public static class TripletBuilder {
        int number = 10000;

        public TripletBuilder withFactorsLessThanOrEqualTo(int factor) {
            this.number = factor;
            return this;
        }

        public TripletBuilder thatSumTo(int sum) {
            this.number = sum;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<PythagoreanTriplet>();
            for (int i = 1; i <= number; i++) {
                for (int j = i; j <= number-i; j++) {
                   int k = number - (i+j);
                   if (i*i + j*j == k*k && j<k) {
                       if (i + j + k == number) {
                           PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(i, j, k);
                           pythagoreanTriplets.add(pythagoreanTriplet);
                       }
                   }
                }
            }

            return pythagoreanTriplets;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}