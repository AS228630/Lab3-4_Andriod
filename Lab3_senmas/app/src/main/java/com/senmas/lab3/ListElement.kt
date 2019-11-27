package com.dmitry.lab3

import android.os.Parcel
import android.os.Parcelable

data class ListElement(val url: String?) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ListElement> {
        override fun createFromParcel(parcel: Parcel): ListElement {
            return ListElement(parcel)
        }

        override fun newArray(size: Int): Array<ListElement?> {
            return arrayOfNulls(size)
        }
    }
}