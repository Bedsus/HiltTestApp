package com.example.feature_authorization

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class AuthModule {

    @Provides
    fun provideToken() = Token("111")
}

class Token(val name: String)