package com.github.czyzby.lml.parser.impl.macro.parent;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.impl.dto.LmlMacroData;
import com.github.czyzby.lml.parser.impl.dto.LmlParent;
import com.github.czyzby.lml.util.gdx.collection.GdxArrays;

public class AssignLmlMacroParent extends AbstractLmlMacroParent {
	public AssignLmlMacroParent(final LmlMacroData lmlMacroData, final LmlParent<?> parent,
			final LmlParser parser) {
		super(lmlMacroData, parent, parser);
	}

	@Override
	public void closeTag(final LmlParser parser) {
		if (GdxArrays.isEmpty(arguments)) {
			throwErrorIfStrict(parser,
					"Parental assign macro needs an attribute - argument name. Received none.");
		} else {
			parser.addArgument(arguments.first(), getAppenedTextWithStrippedEndTag());
		}
	}
}
