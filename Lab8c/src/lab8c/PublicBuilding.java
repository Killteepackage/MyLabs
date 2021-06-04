package lab8c;

abstract public class PublicBuilding implements Building {
    public String Adress;
    public String Name;
    public double Square = 5000;
    public int open;
    public int close;

    @Override
    public String getCategory() {
        return "Публичное здание";
    }

    public boolean openhours;

    public void setOpenhours(boolean openhours) {
        this.openhours = openhours;
    }

    public boolean isOpenhours() {
        return openhours;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String HoldAnEvent(String event){
        return "Пьесса " + event + " идёт в данный момент.";
    }
}
