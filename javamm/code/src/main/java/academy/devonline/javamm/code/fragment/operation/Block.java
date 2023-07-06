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

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author devonline
 * @link https://devonline.academy/javamm
 */
public final class Block extends AbstractOperation implements Operation {

    private final List<Operation> operations;

    public Block(final List<Operation> operations, final SourceLine sourceLine) {
        super(sourceLine);
        this.operations = List.copyOf(operations);
    }

    public Block(final Operation operation, final SourceLine sourceLine) {
        this(List.of(operation), sourceLine);
    }

    public List<Operation> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        /*
        final StringBuilder stringBuilder = new StringBuilder();
        for (final Operation operation : operations) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(System.lineSeparator());
            }
            stringBuilder.append(operation.toString());
        }
        return stringBuilder.toString();
        */
        return operations.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
