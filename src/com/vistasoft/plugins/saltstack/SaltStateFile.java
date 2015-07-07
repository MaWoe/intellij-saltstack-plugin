package com.vistasoft.plugins.saltstack;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SaltStateFile extends PsiFileBase {
    public SaltStateFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SaltStateLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SaltStateFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SaltState File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
