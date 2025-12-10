package com.apologist.api.errors

class ApologistInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : ApologistException(message, cause)
