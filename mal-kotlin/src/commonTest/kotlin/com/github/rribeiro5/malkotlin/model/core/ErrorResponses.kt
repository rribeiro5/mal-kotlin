package com.github.rribeiro5.malkotlin.model.core

internal const val notFoundErrorResponse = """{
  "error": "not_found"
  "message": "anime not found",
}"""

internal const val invalidTokenErrorResponse = """{
  "error": "invalid_token"
  "message": "token is invalid",
}"""

internal const val badRequestErrorResponse = """{
  "error": "bad_request"
  "message": "field is incorrect",
}"""

internal const val serverErrorResponse = """{
  "error": "server_error"
  "message": "unexpected error",
}"""
