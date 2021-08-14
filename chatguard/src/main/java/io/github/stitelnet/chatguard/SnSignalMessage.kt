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

    override fun serialize(): ByteArray {
        return super.serialize()
    }

    override fun getType(): Int {
        return super.getType()
    }

    override fun getSenderRatchetKey(): ECPublicKey {
        return super.getSenderRatchetKey()
    }

    override fun getMessageVersion(): Int {
        return super.getMessageVersion()
    }

    override fun getCounter(): Int {
        return super.getCounter()
    }

    override fun getBody(): ByteArray {
        return super.getBody()
    }

    override fun verifyMac(
        senderIdentityKey: IdentityKey?,
        receiverIdentityKey: IdentityKey?,
        macKey: SecretKeySpec?
    ) {
        super.verifyMac(senderIdentityKey, receiverIdentityKey, macKey)
    }
}