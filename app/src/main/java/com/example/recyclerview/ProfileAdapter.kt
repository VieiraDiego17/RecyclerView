package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecyclerListener
import com.example.recyclerview.models.Profile
import kotlinx.android.synthetic.main.res_item_profile.view.*

class ProfileAdapter(private val onClicked: (Profile) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items : List<Profile>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ProfileViewHolder -> {
                holder.bind(items[position], onClicked)
            }
        }
    }
    override fun getItemCount(): Int {
        return  items.size
    }

    fun setDataSet(list: List<Profile>){
        this.items = list
    }

    class ProfileViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        private val profileName = itemView.name
        private val profileType = itemView.type
        private val profileImage = itemView.image

        fun bind(profile: Profile, onClicked: (Profile) -> Unit){
            profileName.text = profile.name
            profileType.text = profile.type
            profileImage.setImageResource(profile.image)

            itemView.setOnClickListener {
                onClicked(profile)
            }
        }
    }
}