package com.github.rribeiro5.malkotlin.exception

import com.github.rribeiro5.malkotlin.model.core.ErrorType

class MALRequestException(
    override val message: String,
    val errorType: ErrorType,
    val error: String?
) : Exception(message)
