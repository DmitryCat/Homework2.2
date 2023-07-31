public class Main {
    public static void main(String[] args) {
        //Задание 8
        var hour = 640;
        var answer = 0;
        var human = 8;
        var people = hour / human;
System.out.println("Всего работников в компании" + "-" + people + "человек");
people = people + 94;
answer = people * human;
// Не уверен, что правильно понял задачу, а ещё я не понимаю делать в принте пробелы
System.out.println("Если в компании работает" + people + "то всего" + answer + "часов работы может быть поделено между сотрудниками");
    }
}