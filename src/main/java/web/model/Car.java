package web.model;

public class Car {
    private String company;

    private String model;

    private String type;

    public Car (String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }




    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
