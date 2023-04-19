package common.testcases;

import common.src.com.thinking.machine.util.Keyboard;


class KeyBoardTestcase {
    public static void main(String gg[]) {
        Keyboard k = new Keyboard();
        String a;
        System.out.println("enter a sting");
        a = k.getString();

        String b;
        b = k.getString("enter another String:");

        char c;
        c = k.getCharacter("enter gender(M/F):");

        long d;
        d = k.getLong("enter long type value:");

        int e;
        e = k.getInt("enter a int type value:");

        byte f;
        f = k.getByte("enter a byte type value:");

        short g;
        g = k.getShort("enter a short type value:");

        double h;
        h = k.getDouble("enter double type value:");


        boolean i;
        i = k.getBoolean("enter a boolean type value:");

        float j;
        j = k.getFloat("enter float type value:");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //System.out.println(f);
        System.out.println(g);
        //System.out.println(h);
        //System.out.println(i);
        System.out.println(j);

    }
}