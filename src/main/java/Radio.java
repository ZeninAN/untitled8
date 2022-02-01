public class Radio {
    public int currentVolume;
    public int numberStation;

    public void next() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        }
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

    public int getNumberStation() {
        return numberStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume;
            increaseVolume();
        }
    }

    public void reductionVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
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

