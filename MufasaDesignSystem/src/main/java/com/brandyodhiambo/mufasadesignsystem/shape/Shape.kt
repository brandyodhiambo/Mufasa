/*
 * Copyright 2025 MUFASA DESIGN SYSTEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brandyodhiambo.mufasadesignsystem.shape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import com.brandyodhiambo.mufasadesignsystem.theme.token.MufasaShapeToken

data class MufasaShapes(
    val extarSmall: RoundedCornerShape = RoundedCornerShape(2.dp),
    val small: RoundedCornerShape = RoundedCornerShape(4.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(8.dp),
    val large: RoundedCornerShape = RoundedCornerShape(12.dp),
    val extraLarge: RoundedCornerShape = RoundedCornerShape(16.dp)
)

val DefaultMufasaShapes = MufasaShapes(
    extarSmall = RoundedCornerShape(MufasaShapeToken.xs),
    small = RoundedCornerShape(MufasaShapeToken.sm),
    medium = RoundedCornerShape(MufasaShapeToken.md),
    large = RoundedCornerShape(MufasaShapeToken.lg),
    extraLarge = RoundedCornerShape(MufasaShapeToken.xl)
)
