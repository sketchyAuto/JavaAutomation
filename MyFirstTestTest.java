package Basics1;

import org.junit.Test;

import static org.junit.Assert.*;
import Basics1.TestAppEnvironmentTest;


public class MyFirstTestTest extends Basics1.MyFirstTest{

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        assertEquals("2+2=4",4,answer);
    }



}