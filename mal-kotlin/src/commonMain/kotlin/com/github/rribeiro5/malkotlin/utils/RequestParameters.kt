package com.github.rribeiro5.malkotlin.utils

import io.ktor.http.URLBuilder

private const val LIMIT_PARAMETER = "limit"
private const val OFFSET_PARAMETER = "offset"

private const val FIELDS_PARAMETER = "fields"

internal fun <T> URLBuilder.appendQueryParameter(
    name: String,
    value: T?
) {
    value?.let { parameters.append(name, value.toString()) }
}

internal fun URLBuilder.pagingParameters(
    limit: Int?,
    offset: Int?
) {
    appendQueryParameter(LIMIT_PARAMETER, limit)
    appendQueryParameter(OFFSET_PARAMETER, offset)
}

internal fun URLBuilder.fieldsParameter(fields: String?) {
    appendQueryParameter(FIELDS_PARAMETER, fields)
}
