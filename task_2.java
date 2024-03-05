@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

@Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Пользователь младше 18 лет, ожидается false", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Пользователю 18 лет, ожидается true", true, isAdult);
    }
