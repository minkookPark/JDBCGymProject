package 민국;

public class Trainer {
    private int trainer_num;
    private String login_Id;
    private String login_Pw;
    private String gender;
    private String award;
    private int age;

    public Trainer() {
    }

    public Trainer(String login_Id, String login_Pw) {
        this.login_Id = login_Id;
        this.login_Pw = login_Pw;
    }

    public Trainer(String login_Id, String login_Pw, String gender, String award, int age) {
        this.login_Id = login_Id;
        this.login_Pw = login_Pw;
        this.gender = gender;
        this.award = award;
        this.age = age;
    }

    public Trainer(int trainer_num, String login_Id, String login_Pw, String gender, String award, int age) {
        this.trainer_num = trainer_num;
        this.login_Id = login_Id;
        this.login_Pw = login_Pw;
        this.gender = gender;
        this.award = award;
        this.age = age;
    }

    public int getTrainer_num() {
        return trainer_num;
    }

    public void setTrainer_num(int trainer_num) {
        this.trainer_num = trainer_num;
    }

    public String getLogin_Id() {
        return login_Id;
    }

    public void setLogin_Id(String login_Id) {
        this.login_Id = login_Id;
    }

    public String getLogin_Pw() {
        return login_Pw;
    }

    public void setLogin_Pw(String login_Pw) {
        this.login_Pw = login_Pw;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainer_num=" + trainer_num +
                ", login_Id='" + login_Id + '\'' +
                ", login_Pw='" + login_Pw + '\'' +
                ", gender='" + gender + '\'' +
                ", award='" + award + '\'' +
                ", age=" + age +
                '}';
    }
}
