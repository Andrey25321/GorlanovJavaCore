package Lesson_2.Exceptions;

public class MyArraySizeException extends Exception{
    public MyArraySizeException () {
        super("Некорректный размер массива");
    }
}