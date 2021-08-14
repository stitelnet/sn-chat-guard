package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyIdException
import java.lang.Exception

class SnInvalidKeyIdException: Exception {
    constructor(detailMessage: String?) : super(detailMessage)
    constructor(throwable: Throwable?) : super(throwable)
}