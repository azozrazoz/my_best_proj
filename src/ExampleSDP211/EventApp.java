package ExampleSDP211;

public class EventApp {
    public static void main(String[] args) {
        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if(on) {
                    System.out.println("Телевизор выключен");
                    on = false;
                }
                else {
                    System.out.println("Телевизор включен");
                    on = true;
                }
            }
        }, Day.Monday, "TV");

        Button printButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Запущена печать на принтере");
            }
        }, Day.Thursday, "Print");

        tvButton.click();
        printButton.click();
        tvButton.click();

        System.out.println(tvButton.weekDayType);
        System.out.println(printButton.weekDayType);

        Day[] days = Day.values();
        for (Day i: days) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        System.out.println(Day.Tuesday.ordinal());

        System.out.println("--------------------");
        System.out.println(Color.GREEN.getCode());

        System.out.println("--------------------");

        Operation op = Operation.SUM;
        System.out.println(op.action(3, 4));
        System.out.println("--------------------");
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));

        System.out.println("--------------------");
        System.out.println(tvButton.toString());

        System.out.println("--------------------");
        System.out.println(printButton.toString());
    }
}



class ButtonClick implements EventHandler {
    public void execute() {
        System.out.println("Кнопка нажата");
    }
}

interface EventHandler {
    void execute();
}

class Button {
    private String name;
    Day weekDayType;
    EventHandler handler;
    Button(EventHandler action, Day type, String name) {
        this.handler = action;
        this.weekDayType = type;
        this.name = name;
    }

    public void click() {
        handler.execute();
    }

    @Override
    public String toString() {
        return "Device: " + name;
    }

    public void weekDay(Day type) {
        this.weekDayType = type;
    }
}

enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
}

enum Color {
    RED("#FF0000"),
    GREEN("#0000FF"),
    BLUE("#00FF00");

    private final String code;
    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

enum Operation {
    SUBTRACT {
        public int action(int x, int y){
            return x - y;
        }
    },
    SUM {
        public int action(int x, int y){
            return x + y;
        }
    },
    MULTIPLY {
        public int action(int x, int y){
            return x * y;
        }
    };

    public abstract int action(int a, int b);

}
