package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.ecc.Curve
import org.whispersystems.libsignal.ecc.DjbECPublicKey
import org.whispersystems.libsignal.ecc.ECPublicKey

object SnCurve {
    fun generateKeyPair(): SnECKeyPair{
        return Curve.generateKeyPair() as SnECKeyPair
    }

    @Throws(InvalidKeyException::class)
    fun decodePoint(bytes: ByteArray?, offset: Int): SnECPublicKey {
       return Curve.decodePoint(bytes, offset) as SnECPublicKey
    }

}