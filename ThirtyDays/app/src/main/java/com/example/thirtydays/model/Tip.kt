package com.example.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydays.R

data class Tip(
    @DrawableRes var img: Int,
    @StringRes var tip: Int,
    @StringRes var description: Int,
)

object TipsRepository {
    val tips = listOf(
        Tip(R.drawable.tip1, R.string.tip1, R.string.tip1_description),
        Tip(R.drawable.tip2, R.string.tip2, R.string.tip2_description),
        Tip(R.drawable.tip3, R.string.tip3, R.string.tip3_description),
        Tip(R.drawable.tip4, R.string.tip4, R.string.tip4_description),
        Tip(R.drawable.tip5, R.string.tip5, R.string.tip5_description),
        Tip(R.drawable.tip6, R.string.tip6, R.string.tip6_description),
        Tip(R.drawable.tip7, R.string.tip7, R.string.tip7_description),
        Tip(R.drawable.tip8, R.string.tip8, R.string.tip8_description),
        Tip(R.drawable.tip9, R.string.tip9, R.string.tip9_description),
        Tip(R.drawable.tip10, R.string.tip10, R.string.tip10_description),
        Tip(R.drawable.tip11, R.string.tip11, R.string.tip11_description),
        Tip(R.drawable.tip12, R.string.tip12, R.string.tip12_description),
        Tip(R.drawable.tip13, R.string.tip13, R.string.tip13_description),
        Tip(R.drawable.tip14, R.string.tip14, R.string.tip14_description),
        Tip(R.drawable.tip15, R.string.tip15, R.string.tip15_description),
        Tip(R.drawable.tip16, R.string.tip16, R.string.tip16_description),
        Tip(R.drawable.tip17, R.string.tip17, R.string.tip17_description),
        Tip(R.drawable.tip18, R.string.tip18, R.string.tip18_description),
        Tip(R.drawable.tip19, R.string.tip19, R.string.tip19_description),
        Tip(R.drawable.tip20, R.string.tip20, R.string.tip20_description),
        Tip(R.drawable.tip21, R.string.tip21, R.string.tip21_description),
        Tip(R.drawable.tip22, R.string.tip22, R.string.tip22_description),
        Tip(R.drawable.tip23, R.string.tip23, R.string.tip23_description),
        Tip(R.drawable.tip24, R.string.tip24, R.string.tip24_description),
        Tip(R.drawable.tip25, R.string.tip25, R.string.tip25_description),
        Tip(R.drawable.tip26, R.string.tip26, R.string.tip26_description),
        Tip(R.drawable.tip27, R.string.tip27, R.string.tip27_description),
        Tip(R.drawable.tip28, R.string.tip28, R.string.tip28_description),
        Tip(R.drawable.tip29, R.string.tip29, R.string.tip29_description),
        Tip(R.drawable.tip30, R.string.tip30, R.string.tip30_description),
    )
}