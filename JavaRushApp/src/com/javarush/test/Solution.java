package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 19.07.2015.
 */
public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("%s + %s + %s = Чистая любовь, да-да!", bfReader.readLine(), bfReader.readLine(),bfReader.readLine());
        } catch (IOException e)
        {
            e.getStackTrace();
        }


    }
}
