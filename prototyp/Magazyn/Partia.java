package Magazyn;

public class Partia {

    private int id;
    private int data_waznosci;
    private int ilosc;
    private String dostawca;

    public Partia(int data_waznosci, int ilosc, String dostawca) {
        this.id = -1;
        this.data_waznosci = data_waznosci;
        this.ilosc = ilosc;
        this.dostawca = dostawca;
    }

    @Override
    public String toString() {
        return "Partia{ " +
                "id='" + id + '\'' +
                ", data_waznosci=" + data_waznosci +
                ", ilosc=" + ilosc +
                ", dostawca='" + dostawca + '\'' +
                '}';
    }

    public int getIlosc() {
        return ilosc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}