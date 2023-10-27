package api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "19b686031f444d7b627034f753f9d601"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}