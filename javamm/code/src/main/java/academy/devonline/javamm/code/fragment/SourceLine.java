/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.code.fragment;

import java.util.List;
import java.util.Objects;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public class SourceLine implements Comparable<SourceLine>, CompiledCodeFragment {
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

    public String getCommand() {
        return String.join(" ", tokens);
    }

    public String getToken(final int index) {
        return tokens.get(index);
    }

    public int getTokenCount() {
        return tokens.size();
    }

    public String getFirst() {
        return getToken(0);
    }

    public String getLast() {
        return getToken(getTokenCount() - 1);
    }

    public List<String> subList(final int start, final int end) {
        return subList(start, end);
    }

    public List<String> subList(final int start) {
        return subList(start, getTokenCount());
    }

    public boolean contains(final String token) {
        return tokens.contains(token);
    }

    public int indexOf(final String token) {
        return tokens.indexOf(token);
    }

    @Override
    public boolean equals(final Object o) {
        final SourceLine that = (SourceLine) o;
        return getNumber() == that.getNumber() &&
            getModuleName().equals(that.getModuleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModuleName(), getNumber());
    }

    @Override
    public int compareTo(final SourceLine o) {
        final int result = getModuleName().compareTo(o.getModuleName());
        if (result != 0) {
            return result;
        } else {
            return Integer.compare(number, o.number);
        }
    }

    public String toString() {
        return format("[%s:%s -> %s]", moduleName, number, getCommand());
    }
}
