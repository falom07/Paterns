package Iterator;

public class TakeThingInNeedDay {
    String closer[] = {"Gray hat", "Red jecet", "Black jeance", "Pink Sleeve", "White socks"};

    public Iterator takeWhiteThing() {
        return new Paint();
    }

    public Iterator takeRedThing() {
        return new NotPaint();
    }



    private class Paint implements Iterator {
        int number = -2;
        @Override
        public Object next() {
            return closer[number];
        }

        @Override
        public boolean hasNext() {
            number +=2;
            if(number<closer.length){

                return true;
            }else{
                return false;
            }
        }
    }
    private class NotPaint implements Iterator {
        int number = -1;
        @Override
        public Object next() {
            return closer[number];
        }

        @Override
        public boolean hasNext() {
            number +=2;
            if(number<closer.length){

                return true;
            }else{
                return false;
            }
        }
    }
}

