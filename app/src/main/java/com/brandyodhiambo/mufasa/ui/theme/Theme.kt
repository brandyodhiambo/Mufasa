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
package com.brandyodhiambo.mufasa.ui.theme

import androidx.compose.runtime.Composable
import com.brandyodhiambo.mufasadesignsystem.theme.MufasaAppTheme
import com.brandyodhiambo.mufasadesignsystem.theme.Theme


@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MufasaAppTheme(
        theme = Theme.FollowSystem,
        lightColors = lightColors,
        darkColors = darkColors,
        shapes = customShapes,
        content = content
    )
}
