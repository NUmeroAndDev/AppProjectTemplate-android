package jp.numero.template.data.impl

import jp.numero.template.data.TemplateRepository
import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TemplateRepositoryImpl @Inject constructor(
    private val okHttpClient: OkHttpClient,
) : TemplateRepository {

    override suspend fun fetch(): List<String> {
        return emptyList()
    }
}