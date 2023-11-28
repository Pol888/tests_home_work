package ex_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TasksOneAndTwoTest {


    @ParameterizedTest
    @ValueSource(ints = {2, 10, 34, 10010, 384637372, 946434344})
    void testTaskOneEven(int num){
        assertTrue(TasksOneAndTwo.evenOddNumber(num));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 9, 33, 10009, 384637371, 946434345})
    void testTaskOneOdd(int num){
        assertFalse(TasksOneAndTwo.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 37, 65, 67, 88, 99, 100})
    void testTaskTwoEvenIncluded(int num){
        assertTrue(TasksOneAndTwo.numberInInterval(num));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 9, 24, 101, 102, 946434345})
    void testTaskTwoOddNotIncluded(int num){
        assertFalse(TasksOneAndTwo.numberInInterval(num));
    }

}