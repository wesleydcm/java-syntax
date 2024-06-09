/**
 * SmartTv
 */
public class SmartTv {

    boolean on = false;
    int ch = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public int turnUpVolume() {
        volume++;
        return volume;
    }

    public int turnDownVolume() {
        if (this.volume > 0) {
            volume--;
        }

        return volume;
    }

    public int increaseCh() {

        this.ch++;

        return this.ch;
    }

    public int decreaseCh() {

        this.ch--;

        return this.ch;
    }

    public int changeCh(int newCh) {

        this.ch = newCh;

        return this.ch;
    }

}