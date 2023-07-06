/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.code.fragment.operation;

import academy.devonline.javamm.code.fragment.Operation;
import academy.devonline.javamm.code.fragment.SourceLine;

import static java.util.Objects.requireNonNull;

/**
 * @author devonline
 * @link https://devonline.academy/javamm
 */
public final class PrintlnOperation extends AbstractOperation implements Operation {

    private final String text;

    public PrintlnOperation(final SourceLine sourceLine, final String text) {
        super(sourceLine);
        this.text = requireNonNull(text);
    }

    public String getText() {
        return text;
    }
}
