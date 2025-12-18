// File generated from our OpenAPI spec by Stainless.

package com.apologist.api.errors

import com.apologist.api.core.JsonValue
import com.apologist.api.core.http.Headers

abstract class ApologistServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ApologistException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
