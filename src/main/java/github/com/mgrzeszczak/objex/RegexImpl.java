package github.com.mgrzeszczak.objex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class RegexImpl implements Regex {

    private final Pattern pattern;

    RegexImpl(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher match(CharSequence input) {
        return pattern.matcher(input);
    }

}
