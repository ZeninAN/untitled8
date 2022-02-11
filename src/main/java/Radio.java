public class Radio {
    private int currentVolume;
    private int numberStation;
    private int allNumberStation;

    public Radio() {
    }

    public Radio(int allNumberStation) {
        this.allNumberStation = allNumberStation;
    }

    public int getAllNumberStation() {
        return allNumberStation;
    }


    public void next() {
        numberStation = numberStation + 1;
        if (numberStation > 9) {
            numberStation = 0;
        }
    }


    public void setNumberStation(int newNumberStation) {
        if (newNumberStation >= 9) {
            numberStation = newNumberStation;
            next();
        }
        if (newNumberStation < 9) {
            numberStation = newNumberStation;
            next();
        }
    }

    public void prev() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        }
        if (numberStation == 0) {
            numberStation = 9;
        }
    }

    public void setPrevNumberStation(int newNumberStation) {
        if (newNumberStation <= 0) {
            prev();
        }
        if (newNumberStation > 0) {
            numberStation = newNumberStation;
            prev();
        }
    }

    public void setChangeStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;

    }

    public int getNumberStation() {
        return numberStation;
    }

    public void increaseVolume() {
        currentVolume = currentVolume + 1;

    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 100) {
            increaseVolume();
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 100) {
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

