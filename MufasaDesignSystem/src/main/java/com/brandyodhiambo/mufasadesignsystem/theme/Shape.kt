package com.brandyodhiambo.mufasadesignsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class MufasaShapes(
    val extarSmall: RoundedCornerShape = RoundedCornerShape(2.dp),
    val small: RoundedCornerShape = RoundedCornerShape(4.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(8.dp),
    val large: RoundedCornerShape = RoundedCornerShape(12.dp),
    val extraLarge: RoundedCornerShape = RoundedCornerShape(16.dp)
)

object MufasaShapeToken{
    val xs = 4.dp
    val sm = 8.dp
    val md = 16.dp
    val lg = 24.dp
    val xl = 32.dp
}

val DefaultMufasaShapes = MufasaShapes(
    extarSmall = RoundedCornerShape(MufasaShapeToken.xs),
    small = RoundedCornerShape(MufasaShapeToken.sm),
    medium = RoundedCornerShape(MufasaShapeToken.md),
    large = RoundedCornerShape(MufasaShapeToken.lg),
    extraLarge = RoundedCornerShape(MufasaShapeToken.xl)
)
