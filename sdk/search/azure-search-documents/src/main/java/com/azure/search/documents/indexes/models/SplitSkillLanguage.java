// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SplitSkillLanguage.
 */
public final class SplitSkillLanguage extends ExpandableStringEnum<SplitSkillLanguage> {
    /**
     * Static value da for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage DA = fromString("da");

    /**
     * Static value de for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage DE = fromString("de");

    /**
     * Static value en for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage EN = fromString("en");

    /**
     * Static value es for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage ES = fromString("es");

    /**
     * Static value fi for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage FI = fromString("fi");

    /**
     * Static value fr for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage FR = fromString("fr");

    /**
     * Static value it for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage IT = fromString("it");

    /**
     * Static value ko for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage KO = fromString("ko");

    /**
     * Static value pt for SplitSkillLanguage.
     */
    public static final SplitSkillLanguage PT = fromString("pt");

    /**
     * Creates or finds a SplitSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SplitSkillLanguage.
     */
    @JsonCreator
    public static SplitSkillLanguage fromString(String name) {
        return fromString(name, SplitSkillLanguage.class);
    }

    /**
     * @return known SplitSkillLanguage values.
     */
    public static Collection<SplitSkillLanguage> values() {
        return values(SplitSkillLanguage.class);
    }
}