package utility;

import bean.User;

public class UserUtil {

    public static void login () {
        User user=new User();
        user.setName(InputUtil.requireText("Adinizi girin"));
        user.setName(InputUtil.requireText("Soyadinizi girin"));
    }
}
