package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.protocol.PreKeySignalMessage
import org.whispersystems.libsignal.protocol.SignalMessage
import org.whispersystems.libsignal.util.guava.Optional

class SnPreKeySignalMessage : PreKeySignalMessage, SnCiphertextMessage {

    @Throws(SnInvalidMessageException::class, SnInvalidVersionException::class)
    constructor(serialized: ByteArray?) : super(serialized) {}

    constructor(
        messageVersion: Int,
        registrationId: Int,
        preKeyId: Optional<Int?>?,
        signedPreKeyId: Int,
        baseKey: ECPublicKey?,
        identityKey: IdentityKey?,
        message: SignalMessage?
    ) : super(
        messageVersion,
        registrationId,
        preKeyId,
        signedPreKeyId,
        baseKey,
        identityKey,
        message
    ) {
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }

    override fun getType(): Int {
        return super.getType()
    }

    override fun getMessageVersion(): Int {
        return super.getMessageVersion()
    }

    override fun getIdentityKey(): SnIdentityKey {
        return super.getIdentityKey() as SnIdentityKey
    }

    override fun getRegistrationId(): Int {
        return super.getRegistrationId()
    }

    override fun getPreKeyId(): Optional<Int> {
        return super.getPreKeyId()
    }

    override fun getSignedPreKeyId(): Int {
        return super.getSignedPreKeyId()
    }

    override fun getBaseKey(): ECPublicKey {
        return super.getBaseKey()
    }

    override fun getWhisperMessage(): SignalMessage {
        return super.getWhisperMessage()
    }
}