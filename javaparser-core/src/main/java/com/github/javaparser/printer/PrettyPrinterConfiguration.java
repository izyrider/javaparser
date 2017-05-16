/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2016 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.printer;

import java.util.function.Function;

import static com.github.javaparser.utils.Utils.EOL;
import static com.github.javaparser.utils.Utils.assertNotNull;

public class PrettyPrinterConfiguration {
    private boolean printComments = true;
    private String indent = "    ";
    private String endOfLineCharacter = EOL;
    private Function<PrettyPrinterConfiguration, PrettyPrintVisitor> visitorFactory = PrettyPrintVisitor::new;

    public String getIndent() {
        return indent;
    }

    public PrettyPrinterConfiguration setIndent(String indent) {
        this.indent = assertNotNull(indent);
        return this;
    }

    public boolean isPrintComments() {
        return printComments;
    }

    public PrettyPrinterConfiguration setPrintComments(boolean printComments) {
        this.printComments = printComments;
        return this;
    }

    public Function<PrettyPrinterConfiguration, PrettyPrintVisitor> getVisitorFactory() {
        return visitorFactory;
    }

    public PrettyPrinterConfiguration setVisitorFactory(Function<PrettyPrinterConfiguration, PrettyPrintVisitor> visitorFactory) {
        this.visitorFactory = assertNotNull(visitorFactory);
        return this;
    }

    public String getEndOfLineCharacter() {
        return endOfLineCharacter;
    }

    public PrettyPrinterConfiguration setEndOfLineCharacter(String endOfLineCharacter) {
        this.endOfLineCharacter = assertNotNull(endOfLineCharacter);
        return this;
    }
}
