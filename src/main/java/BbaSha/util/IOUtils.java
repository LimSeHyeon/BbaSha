package BbaSha.util;


import BbaSha.exception.BbaShaException;

import java.io.*;

public class IOUtils {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final Class clazz = IOUtils.class;

    public static String readLine() {
        try {
            writeAndFlush("입력 : ");
            return br.readLine();
        } catch(IOException e) {
            throw new BbaShaException(clazz, "입력 이상이 발생했습니다.");
        }
    }

    public static void writelnAndFlush(String message) {
        System.out.println(message + "\n");
    }

    private static void writeAndFlush(String message) {
        System.out.print(message);
    }

    public static void write(String message) {
        try {
        bw.write(message);
        } catch(IOException e) {
            throw new BbaShaException("쓰기 이상이 발생했습니다.");
        }
    }

    public static void flush() {
        try {
            bw.flush();
        } catch(IOException e) {
            throw new BbaShaException("출력 이상이 발생했습니다.");
        }
    }
}
