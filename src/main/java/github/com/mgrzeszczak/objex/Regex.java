package github.com.mgrzeszczak.objex;

import java.util.regex.Matcher;

public interface Regex {

    Matcher match(CharSequence input);

    static RegexBuilder builder() {
        return new RegexBuilder();
    }

}
