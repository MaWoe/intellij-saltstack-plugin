package com.vistasoft.plugins.saltstack.psi;

import com.intellij.psi.tree.IElementType;
import com.vistasoft.plugins.saltstack.SaltStateLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SaltStateElementType extends IElementType {

    public SaltStateElementType(@NotNull @NonNls String debugName) {
        super(debugName, SaltStateLanguage.INSTANCE);
    }
}