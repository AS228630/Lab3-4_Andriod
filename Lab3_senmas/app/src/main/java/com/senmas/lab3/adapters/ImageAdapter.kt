package com.senmas.lab3.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

import com.squareup.picasso.Picasso
import android.view.LayoutInflater
import android.media.MediaPlayer
import android.os.Parcel
import android.os.Parcelable
import com.senmas.lab3.R

class ImageAdapter(val images: Array<String>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(),
    Parcelable {
    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView = itemView as ImageView

        fun downloadImage(url: String) {
            Picasso.get().load(url).into(imageView)
        }
    }

    constructor(parcel: Parcel) : this(parcel.createStringArray() as Array<String>) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image, parent, false)

        val soundPlayer = MediaPlayer.create(parent.context, R.raw.sound)
        view.setOnClickListener {
            soundPlayer.start()
        }

        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val url = images[position]
        holder.downloadImage(url)
    }

    override fun getItemCount(): Int = images.size
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringArray(images)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ImageAdapter> {
        override fun createFromParcel(parcel: Parcel): ImageAdapter {
            return ImageAdapter(parcel)
        }

        override fun newArray(size: Int): Array<ImageAdapter?> {
            return arrayOfNulls(size)
        }
    }

}




