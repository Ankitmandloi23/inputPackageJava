package common.src.com.thinking.machine.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {


    private BufferedReader bufferedReader;

    public Keyboard() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }


    public String getString() {
        String str;
        try {
            str = bufferedReader.readLine();
        } catch (IOException ioException) {
            str = "";
        }
        return str;
    }

    public String getString(String message) {
        System.out.println(message);
        return getString();
    }


    public char getCharacter() {
        return getString().charAt(0);
    }

    public char getCharacter(String message) {
        System.out.println(message);
        return getCharacter();
    }


    public long getLong() {
        long x;
        try {
            x = Long.parseLong(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;
    }


    public long getLong(String message) {
        System.out.println(message);
        return getLong();
    }

    public int getInt() {
        int x;
        try {
            x = Integer.parseInt(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;
    }


    public int getInt(String message) {
        System.out.println(message);
        return getInt();
    }


    public short getShort() {
        short x;
        try {
            x = Short.parseShort(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;
    }


    public short getShort(String message) {
        System.out.println(message);
        return getShort();
    }

    public float getFloat() {
        float x;
        try {
            x = Float.parseFloat(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;
    }


    public float getFloat(String message) {
        System.out.println(message);
        return getFloat();
    }


    public boolean getBoolean() {
        boolean x;
        try {
            x = Boolean.parseBoolean(getString());
        } catch (NumberFormatException numberFormatException) {
            x = false;
        }
        return x;
    }


    public boolean getBoolean(String message) {
        System.out.println(message);
        return getBoolean();
    }


    public byte getByte() {
        byte x;
        try {
            x = Byte.parseByte(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;

    }

    public byte getByte(String message) {
        System.out.println(message);
        return getByte();
    }


    public double getDouble() {
        double x;
        try {
            x = Byte.parseByte(getString());
        } catch (NumberFormatException numberFormatException) {
            x = 0;
        }
        return x;

    }

    public double getDouble(String message) {
        System.out.println(message);
        return getDouble();
    }

}

