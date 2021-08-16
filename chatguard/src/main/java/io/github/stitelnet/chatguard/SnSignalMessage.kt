package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.protocol.SignalMessage
import javax.crypto.spec.SecretKeySpec

class SnSignalMessage: SignalMessage, SnCiphertextMessage {
    constructor(serialized: ByteArray?) : super(serialized)
    constructor(
        messageVersion: Int,
        macKey: SecretKeySpec?,
        senderRatchetKey: ECPublicKey?,
        counter: Int,
        previousCounter: Int,
        ciphertext: ByteArray?,
        senderIdentityKey: IdentityKey?,
        receiverIdentityKey: IdentityKey?
    ) : super(
        messageVersion,
        macKey,
        senderRatchetKey,
        counter,
        previousCounter,
        ciphertext,
        senderIdentityKey,
        receiverIdentityKey
    )


}