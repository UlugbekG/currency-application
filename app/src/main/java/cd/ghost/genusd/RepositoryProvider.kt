package cd.ghost.genusd

import cd.ghost.genusd.data.repository.Repository
import cd.ghost.genusd.data.networking.RetrofitClient

object RepositoryProvider {

    private val client = RetrofitClient.getClient()

    val repository = Repository(client)
}