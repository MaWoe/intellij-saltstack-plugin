// This is a generated file. Not intended for manual editing.
package com.vistasoft.plugins.saltstack.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.vistasoft.plugins.saltstack.psi.impl.*;

public interface SaltStateTypes {

  IElementType PROPERTY = new SaltStateElementType("PROPERTY");

  IElementType COMMENT = new SaltStateTokenType("COMMENT");
  IElementType CRLF = new SaltStateTokenType("CRLF");
  IElementType KEY = new SaltStateTokenType("KEY");
  IElementType SEPARATOR = new SaltStateTokenType("SEPARATOR");
  IElementType VALUE = new SaltStateTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new SaltStatePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
