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

    public void setNext() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            setNumberStation(numberStation + 1);
        }
    }


    public void setNumberStation(int numberStation) {
        if (numberStation > 9) {
            return;
        }
        if (numberStation < 0) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void setPrev() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            setNumberStation(numberStation - 1);
        }
    }


    public int getNumberStation() {
        return numberStation;
    }

    public void setIncreaseVolume() {
        if (currentVolume > 9) {
            currentVolume = 10;
        } else {
            setVolume(currentVolume = currentVolume + 1);
        }
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void setReductionVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            setVolume(currentVolume = currentVolume - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

