package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.ecc.ECPublicKey

class SnIdentityKey: IdentityKey {
    constructor(publicKey: ECPublicKey?) : super(publicKey)

    @Throws(InvalidKeyException::class)
    constructor(bytes: ByteArray?, offset: Int) : super(bytes, offset)



}