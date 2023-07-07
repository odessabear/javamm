/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.compiler.model;

import java.util.List;

/**
 * @author omykhailov(studying)
 * @source https://devonline.academy/javamm
 */
public class TokenParserResult {

    private final List<String> tokens;
    private final boolean multilineCommentStarted;


    public TokenParserResult(final List<String> tokens, final boolean multilineCommentStarted) {
        this.tokens = List.copyOf(tokens);
        this.multilineCommentStarted = multilineCommentStarted;
    }

    public TokenParserResult(final boolean multilineCommentStarted) {
        this(List.of(), multilineCommentStarted);
    }

    public List<String> getTokens() {
        return tokens;
    }

    public boolean isNotEmpty() {
        return !tokens.isEmpty();
    }

    public boolean isMultilineCommentStarted() {
        return multilineCommentStarted;
    }
}
