/*
 * Flatworm - A Java Flat File Importer/Exporter Copyright (C) 2004 James M. Turner.
 * Extended by James Lawrence 2005
 * Extended by Josh Brackett in 2011 and 2012
 * Extended by Alan Henson in 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.blackbear.flatworm.annotations;

import com.blackbear.flatworm.CardinalityMode;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Provides the ability to configure a Segment Element via annotations vs. the flatworm XML structure.
 *
 * @author Alan Henson
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface SegmentElement {

    int order() default 1;

    String lineId() default "default";

    CardinalityMode cardinalityMode() default CardinalityMode.LOOSE;

    int mintCount() default Integer.MIN_VALUE;
    int maxCount() default Integer.MAX_VALUE;

    FieldIdentity fieldIdentity() default @FieldIdentity(startPosition = -1, fieldLength = -1, apply = false, matchIdentities = {});
}