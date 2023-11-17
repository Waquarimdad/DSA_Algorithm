package OOPs.Classes.CollectionFramework.Enumerations;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        /*
            Constructor is not public or protected this is private or default.
            Why? we don't want to create new objects because this is not an enum concept that's why
            Internally: public static final Week Monday = new Week();
         */
        Week() {
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
        System.out.println(week);

//        for (Week day: Week.values()) {
//            System.out.print(day + " ");
//        }
    }
}
