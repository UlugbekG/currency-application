package cd.ghost.genusd.core


open class AppException(
    cause: Throwable? = null,
    message: String? = "",
) : Exception(message, cause)

class NoConnection : AppException()

class BackendException(
    cause: Throwable?,
) : AppException(cause = cause)