class TrafficLightException extends Exception {
    public TrafficLightException(String message) {
        super(message);
    }
}

class TrafficLight {
    private String activeColor = null;

    public void turnOn(String color) throws TrafficLightException {
        if (activeColor != null) {
            throw new TrafficLightException("Error: " + activeColor + " light is already ON. Turn it off first.");
        }

        if (color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Yellow") || color.equalsIgnoreCase("Green")) {
            activeColor = color;
            System.out.println(color + " light is ON");
        } else {
            throw new TrafficLightException("Invalid color: " + color);
        }
    }

    public void turnOff() {
        if (activeColor != null) {
            System.out.println(activeColor + " light is OFF");
            activeColor = null;
        } else {
            System.out.println("No light is currently ON");
        }
    }

    public String getActiveColor() {
        return activeColor;
    }
}

public class threadTrafficSignal {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        try {
            light.turnOn("Red");
            light.turnOn("Green"); // This will throw an exception
        } catch (TrafficLightException e) {
            System.out.println(e.getMessage());
        }

        light.turnOff();

        try {
            light.turnOn("Green");
        } catch (TrafficLightException e) {
            System.out.println(e.getMessage());
        }

        light.turnOff();
    }
}
