package ex_3;




//*Задание 1.
//
//Напишите тесты, покрывающие на 100% метод evenOddNumber,
// который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
//
//Задание 2.
//
//Разработайте и протестируйте метод numberInInterval, который проверяет,
// попадает ли переданное число в интервал (25;100). (код приложен в презентации)
public class TasksOneAndTwo {

    static boolean evenOddNumber(int num){
        return num%2 == 0;
    }

    static boolean numberInInterval(int num) {
        return num >= 25 && num <= 100;
    }

}
