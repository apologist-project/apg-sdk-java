package com.apologist.api.errors

class ApologistIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : ApologistException(message, cause)
