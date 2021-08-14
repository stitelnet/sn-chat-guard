package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.ecc.ECPublicKey

class SnIdentityKey: IdentityKey {
    constructor(publicKey: SnECPublicKey?) : super(publicKey)

    @Throws(SnInvalidKeyException::class)
    constructor(bytes: ByteArray?, offset: Int) : super(bytes, offset)

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun getPublicKey(): SnECPublicKey {
        return super.getPublicKey() as SnECPublicKey
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }

    override fun getFingerprint(): String {
        return super.getFingerprint()
    }
}