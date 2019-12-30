package be.intecbrussel.model;

public class Company {
    private int id;
    private String name;
    private String vat;
    private String address;
    private String city;

    public Company(String name, String vat, String address, String city) {
        this.name = name;
        this.vat = vat;
        this.address = address;
        this.city = city;
    }


    //we hebben hier geen id in de constructor
    //toegevoegd omdat wij geen id hebben toegevoegd als primary id heeft , we hebben dat in database geleerd

    public Company() {
    }

    ;

    public int getId() {
        return id;
    }

    public Company setId(int id) {//hier als wij setter voor id maken , kiezen wij builder in plaats van default
        // anders gaat rode line als wij setId  hebben gebruikt
        this.id = id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return String.format("CompanyApp{id=%d, name='%s', vat='%s', address='%s', city='%s'}", id, name, vat, address, city);
    }


    //wij hebben hier (alt + enter) geklikt om een line te verschijnen
}
