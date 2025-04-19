package com.example.viruj

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(val context : Context, val docs: List<DoctorData>): RecyclerView.Adapter<com.example.viruj.adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.doctor_view, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doctor = docs[position]
        holder.doc_photo.setImageResource(doctor.doc_photo)
        holder.doc_name.text = doctor.doc_name
        holder.doc_experience.text = doctor.doc_experience
        holder.doc_specialisation.text = doctor.doc_specialisation
        holder.doc_location.text = doctor.location_of_doc
        holder.availability_hours.text = doctor.time
        holder.availability_days.text = doctor.days
//        holder.detailsbtn.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(doctor.details))
//            context.startActivity(intent)
//        }


    }

    override fun getItemCount(): Int {
        return docs.size
    }
class ViewHolder(doctor_view: View) : RecyclerView.ViewHolder(doctor_view){
    var doc_photo = doctor_view.findViewById<ImageView>(R.id.doc_photo)
    var doc_name = doctor_view.findViewById<TextView>(R.id.doc_name)
    var doc_experience = doctor_view.findViewById<TextView>(R.id.doc_experience)
    var doc_specialisation = doctor_view.findViewById<TextView>(R.id.doc_speacialisation)
    var doc_location = doctor_view.findViewById<TextView>(R.id.doc_location)
    var availability_hours = doctor_view.findViewById<TextView>(R.id.availability_hours)
    var availability_days = doctor_view.findViewById<TextView>(R.id.availability_days)
//    var detailsbtn = doctor_view.findViewById<Button>(R.id.detailsbtn)
}


}