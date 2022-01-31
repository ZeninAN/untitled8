public class Radio {
    public int currentVolume;
    public int numberStation;

    public int next() {
        int next;
        next =1;
        return next;
    }

    public void setNumberStation(int newNumberStation) {
         if (newNumberStation >= 9) {
            numberStation = 0;
        }
        if ( newNumberStation < 9) {
             numberStation = newNumberStation + next();
        }
    }

    public int getNumberStation(){
        return numberStation;
    }
}

