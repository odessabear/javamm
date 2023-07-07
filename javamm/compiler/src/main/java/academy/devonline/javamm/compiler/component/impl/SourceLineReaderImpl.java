/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.compiler.component.impl;

import academy.devonline.javamm.code.fragment.SourceCode;
import academy.devonline.javamm.code.fragment.SourceLine;
import academy.devonline.javamm.compiler.component.SourceLineReader;
import academy.devonline.javamm.compiler.component.TokenParser;
import academy.devonline.javamm.compiler.model.TokenParserResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * @author omykhailov(studying)
 * @source https://devonline.academy/javamm
 */
public class SourceLineReaderImpl implements SourceLineReader {

    private final TokenParser tokenParser;

    public SourceLineReaderImpl(final TokenParser tokenParser) {
        this.tokenParser = requireNonNull(tokenParser);
    }

    @Override
    public List<SourceLine> read(final SourceCode sourceCode) {
        final List<SourceLine> list = new ArrayList<>();
        final String moduleName = sourceCode.getModuleName();
        int number = 1;
        boolean multilineCommentStarted = false;
        for (final String line : sourceCode.getLines()) {
            final TokenParserResult tokenParserResult = tokenParser.parseLine(line, multilineCommentStarted);
            if (tokenParserResult.isNotEmpty()) {
                list.add(new SourceLine(moduleName, number, tokenParserResult.getTokens()));
            }
            multilineCommentStarted = tokenParserResult.isMultilineCommentStarted();
            number++;
        }
        return Collections.unmodifiableList(list);
    }
}
