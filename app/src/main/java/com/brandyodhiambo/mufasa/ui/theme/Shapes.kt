package com.brandyodhiambo.mufasa.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import com.brandyodhiambo.mufasadesignsystem.shape.MufasaShapes
import com.brandyodhiambo.mufasadesignsystem.theme.token.MufasaShapeToken

val customShapes = MufasaShapes(
    extarSmall = RoundedCornerShape(MufasaShapeToken.xs),
    small = RoundedCornerShape(MufasaShapeToken.sm),
    medium = RoundedCornerShape(MufasaShapeToken.md),
    large = RoundedCornerShape(MufasaShapeToken.lg),
    extraLarge = RoundedCornerShape(MufasaShapeToken.xl)
)