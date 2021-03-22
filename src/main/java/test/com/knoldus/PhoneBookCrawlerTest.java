package test.com.knoldus;

import com.knoldus.PhoneBook;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
* PhoneBookCrawler Tester.
*
* @author <Authors name>
* @since <pre>Mar 21, 2021</pre>
* @version 1.0
*/
public class PhoneBookCrawlerTest {

    /**
     * Before.
     *
     * @throws Exception the exception
     */
    @Before
public void before() throws Exception {
}

    /**
     * After.
     *
     * @throws Exception the exception
     */
    @After
public void after() throws Exception {
}

/**
*
* Method: main(final String[] args).
*
*/
@Test
public void testMain() throws Exception {
//todo: Test goes here...
}

/**
*
* Method: findPhoneByNameAndPunishIfNothingFound(final PhoneBook per).
*
*/
@Test
public void testFindPhoneByNameAndPunishIfNothingFound() throws Exception {
//todo: Test goes here...
    PhoneBook person = new PhoneBook();
    person.addinphonebook("rishabh", 1);
    Optional<Integer> a = person.findPhoneByName("rob");
    assertEquals(Optional.of(0), a);

    Optional<Integer> b = person.findPhoneByName("rishabh");
    assertEquals(Optional.of(1), b);
}

/**
*
* Method: findPhoneByNameAndPrintPhoneBookIfNothingFound(final PhoneBook per).
*
*/
@Test
public void testFindPhoneByNameAndPrintPhoneBookIfNothingFound() throws Exception {
//todo: Test goes here...
    PhoneBook person = new PhoneBook();
    person.addinphonebook("rishabh", 1);
    Optional<Integer> a = person.findPhoneByName("rob");
    Map<String, Integer> m = person.getMap();
    assertEquals(m, person.getMap());
}

/**
*
* Method: findPhoneNumberByNameOrNameByPhoneNumber(final PhoneBook per, final String str, final int numb).
*
*/
@Test
public void testFindPhoneNumberByNameOrNameByPhoneNumber() throws Exception {
//todo: Test goes here...
    PhoneBook person = new PhoneBook();
    person.addinphonebook("RIshbh", 1);
    person.addinphonebook("kritz", 2);
    person.addinphonebook("dad", 0);

    Optional<Integer> a = person.findPhoneByName("RIshbh");
    if (a.get() == 0) {
        Optional<String> b = person.findNameByPhone(0);
        if (b.get() == "") {
            assertEquals(Optional.of(""), b);
        } else {
            assertEquals("kritz", b.get());
        }
    }
}


}
