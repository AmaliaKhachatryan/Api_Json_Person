package json;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setName("Иван");
        post.setPassport("4444 № 44444444");
        post.setPatronymic("Иванович");
        post.setPhone("+7 (999)-999-99-99");
        post.setSurname("Иванов");
//      post.birthday=new FormDate();
        FormDate formDate = new FormDate();
        formDate.setDay(25);
        formDate.setMonth(2);
        formDate.setYear(1990);
        post.setBirthday(formDate);
        post.setSubscriptionShort();
//      post.setSubscription();

        System.out.printf("name : %s,\npassport : %s,\npatronymic : %s,\n" +
                        "phone : %s,\nsurname : %s,\nsubscription : %s,\n" +
                        "day : %d,\nmonth : %d,\nyear : %d,\n", post.getName(), post.getPassport(), post.getPatronymic(),
                post.getPhone(), post.getSurname(), post.isSubscription(), post.getBirthday().getDay(),
                post.getBirthday().getMonth(), post.getBirthday().getYear());

    }
}
