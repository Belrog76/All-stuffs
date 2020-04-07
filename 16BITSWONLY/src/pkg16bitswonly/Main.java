/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16bitswonly;

import java.util.*;
import java.io.*;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            String input = in.readLine();
            StringTokenizer st = new StringTokenizer(input);

            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long P = Long.parseLong(st.nextToken());
            if (A * B == P) {
                System.out.println("POSSIBLE DOUBLE SIGMA");
            } else {
                System.out.println("16 BIT S/W ONLY");
            }
        }
    }
}
