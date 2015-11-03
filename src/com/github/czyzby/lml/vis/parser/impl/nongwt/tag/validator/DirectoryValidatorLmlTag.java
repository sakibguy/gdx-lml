package com.github.czyzby.lml.vis.parser.impl.nongwt.tag.validator;

import com.github.czyzby.kiwi.util.common.Strings;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.vis.parser.impl.tag.validator.AbstractValidatorLmlTag;
import com.kotcrab.vis.ui.InputValidator;
import com.kotcrab.vis.ui.util.form.FormValidator;

/** Attaches {@link FormValidator.DirectoryValidator}s. Checks if the passed text is a path to a directory. Mapped to
 * "directoryValidator", "isDirectory".
 *
 * @author MJ */
public class DirectoryValidatorLmlTag extends AbstractValidatorLmlTag {
    public DirectoryValidatorLmlTag(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        super(parser, parentTag, rawTagData);
    }

    @Override
    public InputValidator getInputValidator() {
        return new FormValidator.DirectoryValidator(Strings.EMPTY_STRING);
    }
}
