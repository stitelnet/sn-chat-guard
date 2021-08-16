package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.IdentityKeyPair
import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.ecc.ECPrivateKey

class SnIdentityKeyPair: IdentityKeyPair {
    constructor(publicKey: IdentityKey?, privateKey: ECPrivateKey?) : super(publicKey, privateKey)

    @Throws(InvalidKeyException::class)
    constructor(serialized: ByteArray?) : super(serialized)

    override fun getPublicKey(): SnIdentityKey? {
        return SnHelper.convertIdentityKey(super.getPublicKey())
    }

}