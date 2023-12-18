public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        Post.name = "Иван";
        Post.pasport = "4444" + "№" + "44444444";
        Post.patronymic = "Иванович";
        Post.phone = "+7 (999) 999-99-99";
        Post.surname = "Иванов";
        {
            Post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1999;
        }
    }
}
