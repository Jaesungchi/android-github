package camp.nextstep.edu.github.data

import retrofit2.http.GET


/**
 * Created by link.js on 2022. 08. 05..
 */
interface GithubService {
    @GET("/repositories")
    suspend fun getRepositories(): List<RepositoryDto>

    companion object {
        const val BASE_URL = "https://api.github.com"
    }
}