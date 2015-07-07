package com.vistasoft.plugins.saltstack;

import com.intellij.lang.Language;

public class SaltStateLanguage extends Language {

    public static final SaltStateLanguage INSTANCE = new SaltStateLanguage();

    private SaltStateLanguage() {
        super("SaltState");
    }
}