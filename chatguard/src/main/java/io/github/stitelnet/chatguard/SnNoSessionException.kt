package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.NoSessionException
import java.lang.Exception

class SnNoSessionException: Exception {
    constructor(s: String?) : super(s)
    constructor(nested: Exception?) : super(nested)
}