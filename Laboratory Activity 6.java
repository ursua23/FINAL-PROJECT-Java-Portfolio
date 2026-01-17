abstract class Device {
    private boolean powerOn = false;

    public void turnOn() {
        powerOn = true;
        showStatus();
    }

    public void turnOff() {
        powerOn = false;
        showStatus();   // Show OFF status
    }

    public boolean isPoweredOn() {
        return powerOn;
    }

    public abstract void showStatus();
}

// =============================
// Air Conditioner
// =============================
class AirConditioner extends Device {
    private int fanSpeed = 3;
    private int temperature = 24;

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("AC -> Fan: " + fanSpeed + ", Temp: " + temperature);
        } else {
            System.out.println("AC -> Device is OFF");
        }
    }
}

// =============================
// Lamp Shade
// =============================
class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    public LampShade(LampShade other) {
        this.brightness = other.brightness;
        this.color = other.color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public void setColor(String color) {
        this.color = color;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("Lamp -> Bright: " + brightness + ", Color: " + color);
        } else {
            System.out.println("Lamp -> Device is OFF");
        }
    }
}

// =============================
// Television
// =============================
class Television extends Device {
    private int channel = 1;
    private int volume = 10;

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("TV -> Ch: " + channel + ", Vol: " + volume);
        } else {
            System.out.println("TV -> Device is OFF");
        }
    }
}

// =============================
// Microwave
// =============================
class Microwave extends Device {
    private int timer = 0;
    private int temperature = 0;

    public void setTimer(int timer) {
        this.timer = timer;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("Microwave -> Timer: " + timer + ", Temp: " + temperature);
        } else {
            System.out.println("Microwave -> Device is OFF");
        }
    }
}

// =============================
// Smart Home Main Class
// =============================
public class SmartHome {

    public static void switchAll(Device[] devices, boolean on) {
        for (Device d : devices) {
            if (on) d.turnOn();
            else d.turnOff();
        }
    }

    public static int countOn(Device[] devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isPoweredOn()) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television();
        Microwave microwave = new Microwave();

        Device[] devices = { ac, lamp1, lamp2, tv, microwave };

        switchAll(devices, true);
        System.out.println("Devices ON: " + countOn(devices));

        switchAll(devices, false);
        System.out.println("Devices ON: " + countOn(devices));
    }
}
