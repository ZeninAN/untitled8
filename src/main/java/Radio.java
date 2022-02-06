public class Radio {
    private int currentVolume;
    private int numberStation;

    public void next() {
            numberStation = numberStation + 1;
    }


    public void setNumberStation(int newNumberStation) {
        if (newNumberStation >= 9) {
            numberStation = newNumberStation;
            next();
            numberStation = 0;
        }
        if (newNumberStation < 9) {
            numberStation = newNumberStation;
            next();
        }
    }

    public int prev() {
        int prev;
        prev = 9;
        return prev;
    }

    public void setPrevNumberStation(int newNumberStation) {
        if (newNumberStation <= 0) {
            numberStation = newNumberStation + prev();
        }
        if (newNumberStation > 0) {
            numberStation = newNumberStation;
            next();
        }
    }
    public void setChangeStation(int newNumberStation){
        if (newNumberStation>9){
            return;
        }
        if (newNumberStation<9){
            numberStation = newNumberStation;
        }
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void increaseVolume() {
            currentVolume = currentVolume + 1;

    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 10) {
            increaseVolume();
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume;
            increaseVolume();
        }
    }

    public void reductionVolume() {
            currentVolume = currentVolume - 1;

    }

    public void setReductionVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 1) {
            currentVolume = newCurrentVolume;
            reductionVolume();
            currentVolume = 1;
        }
        if (newCurrentVolume > 1) {
            currentVolume = newCurrentVolume;
            reductionVolume();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

