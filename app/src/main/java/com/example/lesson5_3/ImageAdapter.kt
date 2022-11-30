package com.example.lesson5_3
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.lesson5_3.databinding.ItemImageBinding

    class ImageAdapter(val list:ArrayList<ImageModel>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
            return ImageViewHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

        override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
            holder.bind(list[position])
        }

        override fun getItemCount(): Int = list.size

        fun addImage(Image : ImageModel) {
            list.add(Image)
        }
        inner class ImageViewHolder(val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(image:ImageModel){
                binding.imageView.load(image.largeImageURL)
            }
        }
    }
}