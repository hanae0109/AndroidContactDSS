package fr.isen.lopez.androidcontactdss.ItemsViewModel

import com.google.gson.annotations.SerializedName


data class Street (

  @SerializedName("number" ) var number : Int?    = null,
  @SerializedName("name"   ) var name   : String? = null

): java.io.Serializable