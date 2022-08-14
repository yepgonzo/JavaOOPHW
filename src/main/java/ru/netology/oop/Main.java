package ru.netology.oop;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 30;
        post.birthday.month = 12;
        post.birthday.year = 1996;

    }
}