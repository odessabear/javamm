/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.compiler.component.impl;

import academy.devonline.javamm.compiler.component.TokenParser;
import academy.devonline.javamm.compiler.model.TokenParserResult;

import java.util.List;

/**
 * @author omykhailov(studying)
 * @source https://devonline.academy/javamm
 */
public class TokenParserImpl implements TokenParser {
    @Override
    public TokenParserResult parseLine(final String line, final boolean multilineCommentStarted) {
        final List<String> tokens = line.isEmpty() ? List.of() : List.of(line.trim().split(" "));
        return new TokenParserResult(tokens, false);
    }
}
