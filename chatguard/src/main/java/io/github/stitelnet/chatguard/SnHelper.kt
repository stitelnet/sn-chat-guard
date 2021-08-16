package io.github.stitelnet.chatguard

import android.util.Base64
import org.whispersystems.libsignal.*
import org.whispersystems.libsignal.ecc.Curve
import org.whispersystems.libsignal.ecc.DjbECPublicKey
import org.whispersystems.libsignal.protocol.CiphertextMessage
import org.whispersystems.libsignal.state.PreKeyRecord
import org.whispersystems.libsignal.state.SessionRecord
import org.whispersystems.libsignal.state.SignedPreKeyRecord
import kotlin.jvm.Throws

object SnHelper {
    fun generateIdentityKeyPair(): SnIdentityKeyPair {
        val identityKeyPairKeys = Curve.generateKeyPair()
        return SnIdentityKeyPair(
            SnIdentityKey(identityKeyPairKeys.publicKey),
            identityKeyPairKeys.privateKey
        )
    }

    fun convertIdentityKey(identityKey: IdentityKey?): SnIdentityKey?{
        if(identityKey==null) return null
        return SnIdentityKey(identityKey.publicKey)
    }

    fun convertSessionRecord(sessionRecord: SessionRecord): SnSessionRecord{
        return SnSessionRecord(sessionRecord.sessionState)
    }

    fun convertSignalProtocolAddress(signalProtocolAddress: SignalProtocolAddress): SnSignalProtocolAddress{

        return SnSignalProtocolAddress(signalProtocolAddress.name, signalProtocolAddress.deviceId)
    }

    fun convertPreKeyRecord(preKeyRecord: PreKeyRecord): SnPreKeyRecord{
        return SnPreKeyRecord(preKeyRecord.serialize())
    }

    fun convertSignedPreKeyRecord(signedPreKeyRecord: SignedPreKeyRecord): SnSignedPreKeyRecord{

        return SnSignedPreKeyRecord(signedPreKeyRecord.serialize())
    }

    fun convertIdentityKeyPair(identityKeyPair: IdentityKeyPair): SnIdentityKeyPair{
        return SnIdentityKeyPair(identityKeyPair.serialize())
    }

    @Throws(UntrustedIdentityException::class)
    fun processSending(cipher: SnSessionCipher, outgoingMessage: ByteArray): AxolotlKey{
        val ciphertextMessage = cipher.encrypt(outgoingMessage)
        return AxolotlKey(ciphertextMessage.serialize(),ciphertextMessage.getType() == CiphertextMessage.PREKEY_TYPE)
    }

    @Throws(InvalidKeyException::class)
    fun decodePoint(preKeyPublicElement: String): SnECPublicKey{
        val dp = Curve.decodePoint(Base64.decode(preKeyPublicElement, Base64.DEFAULT), 0)
        return SnDjbECPublicKey((dp as DjbECPublicKey).publicKey)
    }

}