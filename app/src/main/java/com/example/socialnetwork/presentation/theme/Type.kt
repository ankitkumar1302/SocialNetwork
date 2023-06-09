package com.example.socialnetwork.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.socialnetwork.R
// Added a new font family
val quicksand = FontFamily(
    Font(R.font.quicksand_light , FontWeight.Light),
    Font(R.font.quicksand_bold , FontWeight.Bold),
    Font(R.font.quicksand_medium , FontWeight.Medium),
    Font(R.font.quicksand_regular , FontWeight.Normal),
    Font(R.font.quicksand_semibold , FontWeight.SemiBold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = quicksand, // Change the font from there
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = TextGray
    ),
    h1 = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        color = TextWhite
    ),
    h2 = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        color = TextWhite

    ),
    body2 = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = TextGray
    )

)