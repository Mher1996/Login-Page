package dataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class InputsDataProvider {


    @DataProvider(name = "Inputs")
    public static Object[][] inputs(Method method) {
        if (method.getName().equalsIgnoreCase("loginTestInvalid")) {
            return new Object[][]{
                    {"hsjdhjs", "YsUbEzu"},
                    {"mngr391559", "fkefkfj"},
                    {"ncmncm", "iejejf"}
            };
        } else {
            return new Object[][]{
                    {"mngr391559", "YsUbEzu"}
            };
        }
    }
}
