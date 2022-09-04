package com.example.task16;

import com.example.task16.servises.ServiceIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("..............Task1....................");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ip = reader.readLine();
        reader.close();
        ServiceIP.validationIP(ip);
    }
}
