/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.code.exception;

import static java.util.Objects.requireNonNull;

/**
 * @author omykhailov(studying)
 * @source https://devonline.academy/javamm
 */
public abstract class JavammError extends RuntimeException {

    protected JavammError(final String message) {
        super(requireNonNull(message), null, false, false);
    }
}
