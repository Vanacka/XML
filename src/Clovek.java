import java.io.Serializable;

public class Clovek implements Comparable<Clovek>, Serializable {
    String jmeno;
    String prijmeni;
    int vek;

    public Clovek(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + vek;
    }

    @Override
    public int compareTo(Clovek o) {
        if (prijmeni.compareTo(o.prijmeni) > 0) {
            return 1;
        } else {
            if (prijmeni.compareTo(o.prijmeni) < 0) {
                return -1;
            } else {
                if (prijmeni.compareTo(o.prijmeni) == 0) {

                    if (jmeno.compareTo(o.jmeno) > 0) {
                        return 1;
                    } else {
                        if (jmeno.compareTo(o.jmeno) < 0) {
                            return -1;
                        } else {
                            if (jmeno.compareTo(o.jmeno) == 0) {

                                if (vek > o.vek) {
                                    return 1;
                                } else {
                                    if (vek < o.vek) {
                                        return -1;
                                    } else return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
