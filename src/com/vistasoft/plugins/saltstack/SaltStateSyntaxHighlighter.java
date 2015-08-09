package com.vistasoft.plugins.saltstack;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.vistasoft.plugins.saltstack.psi.SaltStateTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by markus on 08.08.15.
 */
public class SaltStateSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COMMENT = DefaultLanguageHighlighterColors.LINE_COMMENT;

    public static final TextAttributesKey IDENTIFIER = DefaultLanguageHighlighterColors.CLASS_NAME;

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SaltStateLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(SaltStateTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(SaltStateTypes.KEY)) {
            return IDENTIFIER_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
