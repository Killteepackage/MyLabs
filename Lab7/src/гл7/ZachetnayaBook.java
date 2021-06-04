package гл7;
import java.util.Scanner;

public class ZachetnayaBook {
    public static Scanner ob = new Scanner(System.in);
    public info[] info = new info[10];
    public String name;
    public int num;

    public ZachetnayaBook() {
        System.out.print("Введите имя студента: ");
        setname(ob.next());
        System.out.print("Введите количество законченных семестров: ");
        num = ob.nextInt();
        info[] sessions = new info[10];
        for (int i = 0; i < num; i++)
            info[i] = new info();
    }

    public ZachetnayaBook(int num){

    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


    public class info {
        int sessiya, zachet, exam, examinationretake, examretake;
        //int[] marx = new int[10];

        public info() {
            System.out.print("Сессия №: ");
            setNumberOfSession(ob.nextInt());
            System.out.print("Количество экзаменов: ");
            setNumberOfExaminations(ob.nextInt());
            System.out.print("Номер экзамена: ");
            setNumberOfExams(ob.nextInt());
            System.out.print("Количество пересдач экзаменов: ");
            setExaminationretake(ob.nextInt());
            System.out.print("Количество пересдач экзамена: ");
            setExamretake(ob.nextInt());
        }

        public int getNumberOfSession() {
            return sessiya;
        }

        public void setNumberOfSession(int number) {
            this.sessiya = number;
        }

        public int getNumberOfExaminations() {
            return zachet;
        }

        public void setNumberOfExaminations(int zachet) {
            this.zachet = zachet;
        }

        public int getNumberOfExams() {
            return exam;
        }

        public void setNumberOfExams(int exam) {
            this.exam = exam;
        }

        public int getExaminationretake() {
            return examinationretake;
        }

        public void setExaminationretake(int examinationretake) {
            this.examinationretake = examinationretake;
        }

        public int getExamretake() {
            return examretake;
        }

        public void setExamretake(int examretake) {
            this.examretake = examretake;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder("Сессия №" + sessiya +
                    " Содержит: " + zachet +
                    " Экзамена(ов), Экзамен по(предмет) номер " + exam +
                    ", " + examinationretake +
                    " Пересдач(и), " + examretake +
                    " Пересдач(и) по(предмет) номер "+ exam);
            s.append("\n");
            return s.toString();
        }
    }

    public static class Zachetka {
        public static void Title() {
            System.out.println("Белорусский Государственный Университет\n" +
                    "Зачётная книжка студента");
        }
    }

    void Deansignature() {
        ZachetnayaBook D = new ZachetnayaBook(0) {
            @Override
            public String toString() {
                String s = "Декан (ФИО)";
               return s;
            }
        };
System.out.println(D.toString());
    }

    static public void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        ZachetnayaBook ct = new ZachetnayaBook();
        ZachetnayaBook.Zachetka.Title();

        System.out.println("Имя студента: " + ct.getname());
        for (int i = 0; i < ct.num; i++)
            System.out.print(ct.info[i].toString());
        ct.Deansignature();
    }
}

