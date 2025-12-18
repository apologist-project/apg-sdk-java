// File generated from our OpenAPI spec by Stainless.

package com.apologist.api.client

import com.apologist.api.core.ClientOptions
import com.apologist.api.core.getPackageVersion
import com.apologist.api.services.async.PetServiceAsync
import com.apologist.api.services.async.PetServiceAsyncImpl
import com.apologist.api.services.async.StoreServiceAsync
import com.apologist.api.services.async.StoreServiceAsyncImpl
import com.apologist.api.services.async.UserServiceAsync
import com.apologist.api.services.async.UserServiceAsyncImpl
import java.util.function.Consumer

class ApologistClientAsyncImpl(private val clientOptions: ClientOptions) : ApologistClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ApologistClient by lazy { ApologistClientImpl(clientOptions) }

    private val withRawResponse: ApologistClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): ApologistClient = sync

    override fun withRawResponse(): ApologistClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApologistClientAsync =
        ApologistClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pet(): PetServiceAsync = pet

    override fun store(): StoreServiceAsync = store

    override fun user(): UserServiceAsync = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApologistClientAsync.WithRawResponse {

        private val pet: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApologistClientAsync.WithRawResponse =
            ApologistClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pet(): PetServiceAsync.WithRawResponse = pet

        override fun store(): StoreServiceAsync.WithRawResponse = store

        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}
