import java.util.ArrayList;

class Ball { }
class Accordion { }
class Hat { }
class Umbrella { }

public class Main {
    static LostAndFoundOffice lostAndFound = new LostAndFoundOffice();

    public static void main(String[] args) {
        Ball ball = new Ball();
        Accordion accordion = new Accordion();
        Umbrella umbrella = new Umbrella();
        Hat hat = new Hat();

        lostAndFound.put(ball);
        lostAndFound.put(accordion);
        lostAndFound.put(umbrella);

        checkObject(accordion, "Aккордеон");
        checkObject(ball, "Мяч");
        checkObject(null, "Пустая ссылка");
        checkObject(umbrella, "Зонт");
        checkObject(hat, "Шляпа");
    }

    private static void checkObject(Object object, String description) {
        if(lostAndFound.check(object)) {
            System.out.println('\'' + description + "' нашёлся!");
        } else {
            System.out.println('\'' + description + "' в бюро находок никто не приносил :(");
        }
    }
}

class LostAndFoundOffice {
    private ArrayList<Object> things = new ArrayList<>();

    public void put(Object thing) {
        if (thing != null) {
            things.add(thing);
        }
    }

    public boolean check(Object target) {
        if (target == null) {
            return false;
        }
        for (Object object : things) {
            if (object != null && object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}