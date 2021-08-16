package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyException

class SnInvalidKeyException: InvalidKeyException {

    constructor() : super()
    constructor(detailMessage: String?) : super(detailMessage)
    constructor(throwable: Throwable?) : super(throwable)
    constructor(detailMessage: String?, throwable: Throwable?) : super(detailMessage, throwable)


}