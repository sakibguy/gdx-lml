package com.github.czyzby.lml.parser.impl.tag.actor;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlActorBuilder;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.scene2d.ui.reflected.ButtonTable;

/** Handles {@link com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup} Scene2D utility class through a specialized
 * {@link com.badlogic.gdx.scenes.scene2d.ui.Table} extension: {@link ButtonTable}. Allows to group multiple buttons by
 * limiting the min and max amount of buttons that can be checked at once. Handles children like a table, except if the
 * child extends {@link com.badlogic.gdx.scenes.scene2d.ui.Button} class, it will be added to the group. Mapped to
 * "buttonGroup", "buttonTable".
 *
 * @author MJ */
public class ButtonGroupLmlTag extends TableLmlTag {
    public ButtonGroupLmlTag(final LmlParser parser, final LmlTag parentTag, final StringBuilder rawTagData) {
        super(parser, parentTag, rawTagData);
    }

    @Override
    protected Actor getNewInstanceOfActor(final LmlActorBuilder builder) {
        return new ButtonTable(getSkin(builder));
    }

    /** @return {@link com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup} wrapped by the {@link ButtonTable}. */
    @Override
    public Object getManagedObject() {
        return ((ButtonTable) getActor()).getButtonGroup();
    }
}
