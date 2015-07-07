package com.vistasoft.plugins.saltstack;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.vistasoft.plugins.saltstack.parser.SaltStateParser;
import com.vistasoft.plugins.saltstack.psi.SaltStateTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

/**
 * Created by markus on 08.07.15.
 */
public class SaltStateParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    public static final TokenSet COMMENTS = TokenSet.create(SaltStateTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<SaltStateLanguage>findInstance(SaltStateLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new SaltStateLexer((Reader) null));
    }

    @Override
    public PsiParser createParser(final Project project) {
        return new SaltStateParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return SaltStateTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SaltStateFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
