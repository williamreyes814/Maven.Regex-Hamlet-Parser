import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        HamletParser hamletParser = new HamletParser();
        String hamletText = hamletParser.getHamletData();
        String expected = hamletText.replaceAll("Hamlet", "Leon");

        hamletParser.replaceWithLeon();

        String actual = hamletParser.getHamletData();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser hamletParser = new HamletParser();
        String hamletText = hamletParser.getHamletData();
        String expected = hamletText.replaceAll("Horatio", "Tariq");

        hamletParser.replaceWithTariq();

        String actual = hamletParser.getHamletData();
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void testFindHoratio() {
//
//    }
//
//    @Test
//    public void testFindHamlet() {

//    }

//    @Test
//    public void testExample(){
//        String myString = "William Leon Hamlet Tariq Horatio";
//        Pattern pattern = Pattern.compile("Leon"); // What youre searching for in string
//        Matcher matcher = pattern.matcher(myString);// where we want to search
//
//        String expected = "William Blue Hamlet Tariq Horatio";
//        String actual = matcher.replaceAll("Blue");
//
//        Assert.assertEquals(expected, actual);

}