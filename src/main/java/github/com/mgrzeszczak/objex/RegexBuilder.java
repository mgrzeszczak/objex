package github.com.mgrzeszczak.objex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

final public class RegexBuilder {

    private final List<RegexGroup0> groups;

    private Pattern pattern;

    RegexBuilder() {
        groups = new ArrayList<>();
    }

    public RegexGroup0 group() {
        RegexGroup0 group = new RegexGroup0(this);
        groups.add(group);
        return group;
    }

    public Regex build() {
        if (pattern == null) {
            pattern = compile();
        }
        return new RegexImpl(pattern);
    }

    private Pattern compile() {
        String regex = groups.stream()
                .map(RegexGroup0::toString)
                .collect(Collectors.joining());
        return Pattern.compile(regex);
    }
}
