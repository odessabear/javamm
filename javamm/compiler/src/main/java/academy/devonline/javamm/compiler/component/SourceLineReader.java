/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package academy.devonline.javamm.compiler.component;

import academy.devonline.javamm.code.fragment.SourceCode;
import academy.devonline.javamm.code.fragment.SourceLine;

import java.util.List;

/**
 * @author omykhailov(studying)
 * @source https://devonline.academy/javamm
 */
public interface SourceLineReader {

    List<SourceLine> read(SourceCode sourceCode);
}
