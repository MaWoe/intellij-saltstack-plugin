package com.vistasoft.plugins.saltstack;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SaltStateFileType extends LanguageFileType {
    public static final SaltStateFileType INSTANCE = new SaltStateFileType();

    private SaltStateFileType() {
        super(SaltStateLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SaltState file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Salt state file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sls";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SaltStateIcons.FILE;
    }
}