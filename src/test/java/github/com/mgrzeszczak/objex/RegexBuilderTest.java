package github.com.mgrzeszczak.objex;

import org.junit.Assert;
import org.junit.Test;

public class RegexBuilderTest {


    @Test
    public void test() {
        Regex regex = Regex.builder()
                .group()
                .group().digit().once()
                .group().wordCharacter().times(2)
                .phrase("regex")
                .zeroOrMore()
                .build();

        Assert.assertTrue(regex.match("1aaregex2bbregex3ccregex4ddregex").matches());
        Assert.assertFalse(regex.match("2aa22aa").matches());
    }

}