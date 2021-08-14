package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.*
import org.whispersystems.libsignal.protocol.CiphertextMessage
import org.whispersystems.libsignal.state.*

class SnSessionCipher: SessionCipher {
    constructor(
        sessionStore: SessionStore?,
        preKeyStore: PreKeyStore?,
        signedPreKeyStore: SignedPreKeyStore?,
        identityKeyStore: IdentityKeyStore?,
        remoteAddress: SignalProtocolAddress?
    ) : super(sessionStore, preKeyStore, signedPreKeyStore, identityKeyStore, remoteAddress)

    constructor(store: SnSignalProtocolStore?, remoteAddress: SnSignalProtocolAddress?) : super(
        store,
        remoteAddress
    )


    @Throws(SnDuplicateMessageException::class, SnLegacyMessageException::class,
        SnInvalidMessageException::class, SnInvalidKeyIdException::class, SnInvalidKeyException::class, SnUntrustedIdentityException::class)
    fun decrypt(ciphertext: SnPreKeySignalMessage?): ByteArray {
        return super.decrypt(ciphertext)
    }

    @Throws(SnInvalidMessageException::class, SnDuplicateMessageException::class, SnLegacyMessageException::class,
        SnNoSessionException::class, SnUntrustedIdentityException::class)
    fun decrypt(ciphertext: SnSignalMessage?): ByteArray {
        return super.decrypt(ciphertext)
    }

    @Throws(SnUntrustedIdentityException::class)
    override fun encrypt(paddedMessage: ByteArray?): SnCiphertextMessage {
        return super.encrypt(paddedMessage) as SnCiphertextMessage
    }


}