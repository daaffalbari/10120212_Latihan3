package com.penatabahasa.latihan3.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
29 april 2023
10120212
Daffa Albari
IF-6
*/

@Parcelize
data class User(
    val name: String?,
    val age: Int?
) : Parcelable