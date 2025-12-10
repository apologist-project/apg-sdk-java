// File generated from our OpenAPI spec by Stainless.

package com.apologist.api.client

import com.apologist.api.core.ClientOptions
import com.apologist.api.core.getPackageVersion
import com.apologist.api.services.blocking.PetService
import com.apologist.api.services.blocking.PetServiceImpl
import com.apologist.api.services.blocking.StoreService
import com.apologist.api.services.blocking.StoreServiceImpl
import com.apologist.api.services.blocking.UserService
import com.apologist.api.services.blocking.UserServiceImpl
import java.util.function.Consumer

class ApologistClientImpl(private val clientOptions: ClientOptions) : ApologistClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ApologistClientAsync by lazy { ApologistClientAsyncImpl(clientOptions) }

    private val withRawResponse: ApologistClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ApologistClientAsync = async

    override fun withRawResponse(): ApologistClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApologistClient =
        ApologistClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pet(): PetService = pet

    override fun store(): StoreService = store

    override fun user(): UserService = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApologistClient.WithRawResponse {

        private val pet: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApologistClient.WithRawResponse =
            ApologistClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pet(): PetService.WithRawResponse = pet

        override fun store(): StoreService.WithRawResponse = store

        override fun user(): UserService.WithRawResponse = user
    }
}
