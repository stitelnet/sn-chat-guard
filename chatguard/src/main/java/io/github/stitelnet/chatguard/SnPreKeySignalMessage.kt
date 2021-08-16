package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.InvalidMessageException
import org.whispersystems.libsignal.InvalidVersionException
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.protocol.PreKeySignalMessage
import org.whispersystems.libsignal.protocol.SignalMessage
import org.whispersystems.libsignal.util.guava.Optional

class SnPreKeySignalMessage : PreKeySignalMessage, SnCiphertextMessage {

    @Throws(InvalidMessageException::class, InvalidVersionException::class)
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



}