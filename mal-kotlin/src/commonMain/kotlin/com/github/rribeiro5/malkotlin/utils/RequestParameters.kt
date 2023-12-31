package com.github.rribeiro5.malkotlin.utils

import io.ktor.http.URLBuilder

private const val LIMIT_PARAMETER = "limit"
private const val OFFSET_PARAMETER = "offset"

private const val FIELDS_PARAMETER = "fields"

internal fun <T> URLBuilder.queryParameterIfNotNull(
    name: String,
    value: T?
) {
    value?.let { parameters.append(name, value.toString()) }
}

internal fun URLBuilder.pagingParameters(
    limit: Int?,
    offset: Int?
) {
    queryParameterIfNotNull(LIMIT_PARAMETER, limit)
    queryParameterIfNotNull(OFFSET_PARAMETER, offset)
}

internal fun URLBuilder.fieldsParameter(fields: String?) {
    queryParameterIfNotNull(FIELDS_PARAMETER, fields)
}
