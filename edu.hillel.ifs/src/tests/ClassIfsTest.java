package tests;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

import src.ClassIfs;

public class ClassIfsTest {

    // Если а – четное посчитать а*б, иначе а+б

    @Test
    public void test_1() {
	assertEquals(6, ClassIfs.fun(2, 3));
    }

    @Test
    public void test_2() {
	assertEquals(5, ClassIfs.fun(3, 2));
    }

    // Определить какой четверти принадлежит точка с координатами (х,у)

    @Test
    public void testQuater_1() {
	int q = ClassIfs.quater(1, 1);
	assertEquals(1, q);
    }

    @Test
    public void testQuater_2() {
	int q = ClassIfs.quater(-2, 4);
	assertEquals(2, q);
    }

    @Test
    public void testQuater_3() {
	int q = ClassIfs.quater(-2, -1);
	assertEquals(3, q);
    }

    @Test
    public void testQuater_4() {
	int q = ClassIfs.quater(4, -6);
	assertEquals(4, q);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuater_zero5() {
	ClassIfs.quater(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuater_4zero() {
	ClassIfs.quater(4, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuater_zerozero() {
	ClassIfs.quater(0, 0);
    }

    // Найти сумму только положительных из трех чисел

    @Test
    public void test_sum_1() {
	assertEquals(10, ClassIfs.fun_1(-1, 6, 4));
    }

    @Test
    public void test_sum_2() {
	assertEquals(4, ClassIfs.fun_1(-1, -6, 4));
    }

    @Test
    public void test_sum_3() {
	assertEquals(6, ClassIfs.fun_1(-1, 6, -4));
    }

    @Test
    public void test_sum_4() {
	assertEquals(1, ClassIfs.fun_1(1, -6, -4));
    }

    @Test
    public void test_sum_5() {
	assertEquals(0, ClassIfs.fun_1(-1, -6, -4));
    }

    @Test
    public void test_sum_6() {
	assertEquals(11, ClassIfs.fun_1(1, 6, 4));
    }

    // Посчитать выражение макс(а*б*с, а+б+с)+3

    @Test
    public void testMax_1() {
	int max = ClassIfs.fun_2(1, 1, 1);
	assertEquals(6, max);
    }

    @Test
    public void testMax_2() {
	int max = ClassIfs.fun_2(2, 2, 2);
	assertEquals(11, max);

    }

    // Написать программу определения оценки студента по его рейтингу

    @Test
    public void test_A1() {
	assertEquals("A", ClassIfs.student_assessment(90));
    }

    @Test
    public void test_A2() {
	assertEquals("A", ClassIfs.student_assessment(100));
    }

    @Test
    public void test_B1() {
	assertEquals("B", ClassIfs.student_assessment(75));
    }

    @Test
    public void test_B2() {
	assertEquals("B", ClassIfs.student_assessment(89));
    }

    @Test
    public void test_C1() {
	assertEquals("C", ClassIfs.student_assessment(60));
    }

    @Test
    public void test_C2() {
	assertEquals("C", ClassIfs.student_assessment(74));
    }

    @Test
    public void test_D1() {
	assertEquals("D", ClassIfs.student_assessment(40));
    }

    @Test
    public void test_D2() {
	assertEquals("D", ClassIfs.student_assessment(59));
    }

    @Test
    public void test_E1() {
	assertEquals("E", ClassIfs.student_assessment(20));
    }

    @Test
    public void test_E2() {
	assertEquals("E", ClassIfs.student_assessment(39));
    }

    @Test
    public void test_F1() {
	assertEquals("F", ClassIfs.student_assessment(19));
    }

    @Test
    public void test_F2() {
	assertEquals("F", ClassIfs.student_assessment(0));
    }
    @Test(expected = InputMismatchException.class)
    public void test_null() {
	assertEquals("F", ClassIfs.student_assessment(-1));
    }
 
    @Test(expected = InputMismatchException.class)
    public void test_out() {
	assertEquals("F", ClassIfs.student_assessment(101));
    }
    
}