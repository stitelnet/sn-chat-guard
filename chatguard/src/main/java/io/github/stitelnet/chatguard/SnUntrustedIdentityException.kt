package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.UntrustedIdentityException
import java.lang.Exception

class SnUntrustedIdentityException(name: String?, key: IdentityKey?) :
    UntrustedIdentityException(name, key) {
}