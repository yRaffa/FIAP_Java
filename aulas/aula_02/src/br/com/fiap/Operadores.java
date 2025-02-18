package br.com.fiap;

public class Operadores {
    public static void main(String[] args) {
        byte xByte = 1, yByte = 2, resultadoByte = 0;
        short xShort = 10, yShort = 20, resultadoShort = 0;
        int xInt = 100, yInt = 200, resultadoInt = 0;
        long xLong = 1000, yLong = 2000, resultadoLong = 0;
        float xFloat = 10.1f, yFloat = 20.2f, resultadoFloat = 0;
        double xDouble = 100.11, yDouble = 200.22, resultadoDouble = 0;

        resultadoByte = (byte) (xByte + yByte);
        resultadoShort = (short) (xShort - yShort);
        resultadoInt = xInt * yInt;
        resultadoLong = xLong * yLong;
        resultadoFloat = xFloat % yFloat;
        resultadoDouble = xDouble / yDouble;

        System.out.println("Byte: " + resultadoByte + "\nShort: " + resultadoShort + "\nInt: " + resultadoInt + "\nLong: " + resultadoLong + "\nFloat: " + resultadoFloat + "\nDouble: " + resultadoDouble);
    }
}
