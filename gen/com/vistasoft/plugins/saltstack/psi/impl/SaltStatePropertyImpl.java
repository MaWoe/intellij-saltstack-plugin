// This is a generated file. Not intended for manual editing.
package com.vistasoft.plugins.saltstack.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.vistasoft.plugins.saltstack.psi.SaltStateTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.vistasoft.plugins.saltstack.psi.*;

public class SaltStatePropertyImpl extends ASTWrapperPsiElement implements SaltStateProperty {

  public SaltStatePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SaltStateVisitor) ((SaltStateVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
