package json;

import java.time.LocalDate;
import java.time.MonthDay;

public class Post {
    private String name;
    private String passport;
    private String patronymic;
    private String phone;
    private String surname;
    private boolean subscription;
    private FormDate birthday;

    public void setBirthday(FormDate birthday) {
        this.birthday = birthday;
    }

    public FormDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
        public void setSubscriptionShort() {
        subscription = MonthDay.of(birthday.getMonth(),
                birthday.getDay()).equals(MonthDay.now());
    }
    public void setSubscription() {
        LocalDate obj = LocalDate.now();
        int current_month = obj.getMonth().getValue();
        int current_day = obj.getDayOfMonth();
        if (birthday.getMonth() == current_month &&
                birthday.getDay() == current_day) {
            subscription = true;
        } else {
            subscription = false;
        }
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isSubscription() {
        return subscription;
    }

}
