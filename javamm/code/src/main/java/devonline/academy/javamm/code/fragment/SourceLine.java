package devonline.academy.javamm.code.fragment;

import java.util.List;
import static java.util.Objects.requireNonNull;

public class SourceLine implements Comparable<SourceLine>, CompiledCodeFragment{
    public static final SourceLine EMPTY_SOURCE_LINE = new SourceLine("<UNDEFINED>", 0, List.of());

    private final String moduleName;
    private final int number;
    private final List<String> tokens;

    public SourceLine(final String moduleName, final int number, final List<String> tokens) {
        this.moduleName = requireNonNull(moduleName);
        this.number = number;
        this.tokens = List.copyOf(tokens);
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getNumber() {
        return number;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getCommand(){
        return String.join(" ",tokens);
    }

    public String getToken(final int index){
        return tokens.get(index);
    }
    @Override
    public int compareTo(final SourceLine o) {
        return 0;
    }
}
