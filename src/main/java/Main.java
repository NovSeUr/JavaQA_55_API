public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 8;
        post.birthday.year = 1992;
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 444444";
        post.phone = "+7 999 888 99 88";
        post.subscription = true;
    }
}
