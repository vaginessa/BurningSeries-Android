package de.datlag.network.m3o

import com.hadiyarajesh.flower.ApiResponse
import de.datlag.model.Constants
import de.datlag.model.m3o.image.Convert
import io.michaelrocks.paranoid.Obfuscate
import kotlinx.coroutines.flow.Flow
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Url

@Obfuscate
interface Image {
	
	@Headers("Content-Type: ${Constants.MEDIATYPE_JSON}")
	@POST("/v1/image/Convert")
	fun convertURL(@Header("Authorization") token: String, @Body body: Convert.RequestURL): Flow<ApiResponse<Convert>>
	
	@GET
	fun getImageFromURL(@Url url: String): Flow<ApiResponse<ResponseBody>>
}