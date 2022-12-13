package com.Tec_BoyJ;

import com.Tec_BoyJ.Main.Main;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static com.Tec_BoyJ.Main.Main.*;

public class Day10 {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        Main main = new Main("/Tec_BoyJ/Day10.txt", "/Tec_BoyJ/Day10 Practice.txt", "/Day10.txt");

        for (int f = 0; f < main.file.length; f++) {
            String[] arr = Main.setUp(f, main.file[f]);
            System.out.println(ANSI_GREEN + "Part 1: --------------------" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "Part 2: --------------------" + ANSI_RESET);
        }
    }
}