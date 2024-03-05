import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	 this.age = age;
     this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		{17, false}, // Пользователю меньше 18 лет
        {18, true},  // Пользователю ровно 18 лет
        {19, true},  // Пользователю больше 18 лет
        {21, true},  // Пользователю больше 18 лет
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Проверка для возраста " + age, result, isAdult);
	}
}
