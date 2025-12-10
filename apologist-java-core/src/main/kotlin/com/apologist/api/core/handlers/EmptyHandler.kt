@file:JvmName("EmptyHandler")

package com.apologist.api.core.handlers

import com.apologist.api.core.http.HttpResponse
import com.apologist.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
