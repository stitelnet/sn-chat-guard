package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.IdentityKeyPair
import org.whispersystems.libsignal.ecc.ECPrivateKey

class SnIdentityKeyPair: IdentityKeyPair {
    constructor(publicKey: SnIdentityKey?, privateKey: SnECPrivateKey?) : super(publicKey, privateKey)

    @Throws(SnInvalidKeyException::class)
    constructor(serialized: ByteArray?) : super(serialized)

    override fun getPublicKey(): SnIdentityKey {
        return super.getPublicKey() as SnIdentityKey
    }

    override fun getPrivateKey(): SnECPrivateKey {
        return super.getPrivateKey() as SnECPrivateKey
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }
}