package com.company;

/*

0916 Checked exception catch
In the processExceptions method, handle all checked exceptions.
It is necessary to display each thrown checked exception.
Only one try..catch block can be used.

Requirements:
1. The processExceptions method should call method1.
2. The processExceptions method should call method2.
3. The processExceptions method should call method3.
4. The processExceptions method should use only one try..catch block.
5. The processExceptions method should catch and display all raised checked exceptions.
6. The program should display the text.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.util.*;


public class Main {

        public static void main(String[] args) {
                try    {
                        divisionByZero();
                }  catch (ArithmeticException e)    {
                        e.printStackTrace();
                }
        }
        public static void divisionByZero()
        {
                int i = (int)(Math.random()/0);
                System.out.println(i);
        }
        public static void printStackTrace(Exception e)
        {
                for (StackTraceElement a : e.getStackTrace())
                        System.out.println(a);
        }
}






