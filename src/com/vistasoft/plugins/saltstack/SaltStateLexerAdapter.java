package com.vistasoft.plugins.saltstack;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by markus on 08.07.15.
 */
public class SaltStateLexerAdapter extends FlexAdapter {

    public SaltStateLexerAdapter() {
        super(new SaltStateLexer((Reader) null));
    }
}
