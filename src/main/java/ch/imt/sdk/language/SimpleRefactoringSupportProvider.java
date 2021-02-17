package ch.imt.sdk.language;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import ch.imt.sdk.language.psi.SimpleProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SimpleRefactoringSupportProvider extends RefactoringSupportProvider {

    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement elementToRename, @Nullable PsiElement context) {
        return (elementToRename instanceof SimpleProperty);
    }

}