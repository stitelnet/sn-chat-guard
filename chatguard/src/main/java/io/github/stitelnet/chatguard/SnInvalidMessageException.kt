package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidMessageException
import java.lang.Exception

class SnInvalidMessageException: Exception {
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)

}