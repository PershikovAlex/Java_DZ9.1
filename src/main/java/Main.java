public class Main {

    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Александр";
        post.surname = "Першиков";
        post.patronymic = "Игоревич";
        post.passport = "7777 № 777777";
        post.phone = "+7-922-222-22-22";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.date = 01;
        post.birthday.month = 02;
        post.birthday.year = 1990;


    }
}
