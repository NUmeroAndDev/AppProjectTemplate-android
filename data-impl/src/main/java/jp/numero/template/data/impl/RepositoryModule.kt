package jp.numero.template.data.impl

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.numero.template.data.TemplateRepository

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bind(impl: TemplateRepositoryImpl): TemplateRepository
}