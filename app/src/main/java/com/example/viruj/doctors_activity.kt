package com.example.viruj

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class doctors_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctors)
        val doctors = listOf(
            DoctorData(
                R.drawable.dr_amrapali_dixit,
                "Dr Amrapali Dixit",
                "24 Years+ Experience",
                "MBBS MS(Ob and Gynae...)",
                "Gurugram Sector 82",
                "11:00 AM-3:00 PM | ",
                "Mon-Sat"
            ),
            DoctorData(
                R.drawable.dr_swati_chabra,
                "Dr Swati Chhabra",
                "15 Years+ Experience",
                "Obstetrics and Gynaecology",
                "Gurugram-Sector 82",
                "5:00 PM to 8:00 PM | ",
                "Mon-Sat"
            ),
            DoctorData(
                R.drawable.dr_seema_santosh,
                "Dr Seema Santosh",
                "20 Years Experience",
                "Obstetrics and Gynaecology",
                "Gurugram-Sector 82",
                "Mon, Sat : 10:00 AM to 2:00 PM|",
                "Tue ,Wed, Thur, Sun : 11 AM to 2:00 PM"
            ),
            DoctorData(
                R.drawable.dr_rahul_aggarwal,
                "Dr Rahul Aggarwal",
                "14 Years Experience",
                "Paediatrics and Neonatology",
                "Gurugram-Sector 82",
                "Mon - Sat : 11:00 AM to 3:00 PM |",
                "Sun : 9:00 AM to 12:00 PM"
            ),
            DoctorData(
                R.drawable.dr_vikas_kathuria,
                "Dr Vikas Kathuria",
                "22 Years Experience",
                "Neurology & Neuro Surgery",
                "Gurugram-Sector 8",
                "Mon & Wed ",
                "3:30PM to 4:30PM"
            ),
            DoctorData(
                R.drawable.dr_govind_yadav,
                "Dr Govind Yadav",
                "12 Years Experience",
                "General Surgery",
                "Gurugram-Sector 82",
                "MBBS, MS",
                "FMAS"
            ),
            DoctorData(
                R.drawable.dr_sumit_anand,
                "Dr Sumit Anand",
                "15 Years Experience",
                "Orthopedics",
                "Gurugram-Sector 82",
                "Mon - Sat ",
                "6:00 PM to 7:00 PM"
            ),
            DoctorData(
                R.drawable.dr_sumit_gulla,
                "Dr Sumit Gulla",
                "14 Years Experience",
                "Internal Medicine",
                "Gurugram-Sector 82",
                "Mon - Sat : 3:00 PM to 8:00 PM |",
                "Sun : 10:00 AM to 12:00 PM"
            ),
            DoctorData(
                R.drawable.dr_saurabh_jindal,
                "Dr Saurabh Jindal",
                "8 Years Experience",
                "Internal Medicine",
                "Gurugram-Sector 82",
                "Mon, Wed, Fri : 9:00 AM to 11:00 PM |",
                "Tue, Thur, Sat : 9:00 AM to 1:00 PM"
            ),
            DoctorData(
                R.drawable.dr_ankit_gupta,
                "Dr Ankit Gupta",
                "10 Years Experience",
                "Urology",
                "Gurugram-Sector 82",
                "Thur : 4:40 PM to 6:30 PM |" ,
                "Sun : 10:00 AM to 12:00 PM"
            ),
            DoctorData(
                R.drawable.dr_vishwas_bhatia,
                "Dr Vishwas Bhaitia",
                "20 Years Experience",
                "Dental and Maxillofacial Surgery",
                "Gurugram-Sector 82",
                "Mon - Sat : 10:00 AM to 8:00 PM | ",
                "Sun : 10:00 AM to 1:00 PM"
            ),
            DoctorData(
                R.drawable.dr_abhijit_ranjan,
                "Dr Abhijit Ranjan",
                "10 Years Experience",
                "Gastroenterology",
                "Gurugram-Sector 82",
                "9:30 AM to 10:30 AM" ,
                "Wed, Sat"
            ),
            DoctorData(
                R.drawable.dr_reena_thukral,
                "Dr Reena Thukral",
                "23 Years Experience",
                "Neurology",
                "Gurugram-Sector 82",
                "Mon, Wed, Fri : 10:00 AM to 1:00 PM | ",
                "Sun : 12:00 PM to 2:00 PM"
            ),
            DoctorData(
                R.drawable.dr_daksh_yadav,
                "Dr Daksh Yadav",
                "11 Years Experience",
                "Paediatrics and Neonatology",
                "Gurugram-Sector 82",
                "9:00 AM to 11:00 AM",
                "Mon - Sat"
            ),
            DoctorData(
                R.drawable.dr_vatsal_bajaj,
                "Dr Vatsal Bajaj",
                "7 Years Experience",
                "Paediatrics and Neonatology",
                "Gurugram-Sector 82",
                "3:00 PM to 6:00 PM",
                "Mon - Fri"
            ),
            DoctorData(
                R.drawable.dr_hema_kapoor,
                "Dr Hema Kapoor",
                "19 Years Experience",
                "General Surgery, Laparoscopy and Minimal Access Surgery",
                "Gurugram-Sector 8",
                "5:00 PM to 7:00 PM",
                "Tue, Thur & Sat"
            ),
            DoctorData(
                R.drawable.dr_surbhi_gupta,
                "Dr Surbhi Gupta",
                "16 Years Experience",
                "Obstetrics and Gynaecology",
                "Gurugram-Sector 8",
                "Mon : 5:00 PM to 7:00 PM",
                "Wed & Fri : 9:00 AM to 11:00 AM"
            ),
            DoctorData(
                R.drawable.dr_shweta_verma,
                "Dr Shweta Verma",
                "12 Years Experience",
                "Obstetrics and Gynaecology",
                "Gurugram-Sector 8",
                "11 AM to 1 PM & 6 PM to 7 PM",
                "Tue, Thur & Sat"
            ),
            DoctorData(
                R.drawable.dr_mehak_maheshwary,
                "Dr Mehak Maheshwary",
                "10 Years Experience",
                "ENT, Head and Neck Surgery",
                "Gurugram-Sector 8",
                "10:00AM to 4:00PM",
                "Tue, Thur & Sat"
        ),
            DoctorData(
                R.drawable.dr_sumit_bansal,
                "Dr Sumit Bansal",
                "10 Years Experience",
                "Urology",
                "Gurugram-Sector 8",
                "12:00 PM to 1:00 PM",
                "Thur"
            )
        )
        val docList = findViewById<RecyclerView>(R.id.docList)
        docList.adapter = adapter(this, doctors)
        docList.layoutManager = LinearLayoutManager(this)
    }
}