package com.dee.doodleblue.MVVM

import retrofit2.http.GET
import retrofit2.http.Query


interface Api {
    //for Assests values
    @GET("assets")
  suspend fun AssestsApi(
    ): Assests
}