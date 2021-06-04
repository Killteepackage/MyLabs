package lab8c;

public class Theatre extends PublicBuilding {

    public String play;
    public String[] afisha = new String[]{"Дикая охота короля Стаха", "Ромео и Джульетта", "Ревизор", "Евгений Онегин"};
    public int time;

    public Theatre() {
       super.open = 10;
       super.close = 22;
       super.setName("Неизвестный");
       play = "Неизвестно";
       time  =10;
       super.openhours = true;
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public Theatre(String name, int Time) {
        super.open = 10;
        super.close = 22;
        super.setName(name);
        int i = (int)(abs(Time - 10)/3);
        play = afisha[i];
        time  = Time;
        super.openhours = ((Time - 10 >= 0)&&(22 - Time >=0));
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setTime(int time) {
        this.time = time;
        super.openhours = ((time - 10 >= 0)&&(22 - time >=0));
    }

    public int getTime() {
        return time;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getPlay() {
        return play;
    }

    @Override
    public void setAdress(String adress) {
        super.Adress = adress;
    }

    @Override
    public String getAdress() {
        return super.Adress;
    }


    @Override
    public void setSquare(double square) {
        super.Square =square;
    }

    @Override
    public double getSquare() {
        return super.Square;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Театр " + Name + " находится на "+ Adress);
        if (openhours) {
            s.append(", работает до 22:00. Площадь " + getCategory()+ " равна "+ Square+" кв. м. ");
            s.append(super.HoldAnEvent(play));
        }
        else s.append(", закрыт до 10:00. Площадь " + getCategory()+ " равна "+ Square+" кв. м. ");
        return s.toString();
    }
}
