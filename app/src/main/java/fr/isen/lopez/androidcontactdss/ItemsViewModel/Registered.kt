package fr.isen.lopez.androidcontactdss.ItemsViewModel

import com.google.gson.annotations.SerializedName


data class Registered (

  @SerializedName("date" ) var date : String? = null,
  @SerializedName("age"  ) var age  : Int?    = null

): java.io.Serializable