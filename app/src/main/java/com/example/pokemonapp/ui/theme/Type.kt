package com.example.pokemonapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pokemonapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

)
//Adding custom fonts.
val RobotoBold = FontFamily(Font(R.font.roboto_bold))
val RobotoLight = FontFamily(Font(R.font.roboto_light))
val RobotoMedium = FontFamily(Font(R.font.roboto_medium))
val RobotoRegular = FontFamily(Font(R.font.roboto_regular))

/*
In Jetpack Compose, the R class is an auto-generated class that holds references to all the
resources in your Android project. The R class is generated during the build process and contains
nested classes for each type of resource, such as R.drawable, R.color, R.string, R.layout, R.font,
and so on.
 */