package jp.numero.template.data

interface TemplateRepository {
    suspend fun fetch(): List<String>
}