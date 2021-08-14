package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.ecc.ECKeyPair
import org.whispersystems.libsignal.ecc.ECPrivateKey
import org.whispersystems.libsignal.ecc.ECPublicKey

class SnECKeyPair(publicKey: ECPublicKey?, privateKey: ECPrivateKey?) :
    ECKeyPair(publicKey, privateKey) {
    override fun getPublicKey(): SnECPublicKey {
        return super.getPublicKey() as SnECPublicKey
    }

    override fun getPrivateKey(): SnECPrivateKey {
        return super.getPrivateKey() as SnECPrivateKey
    }
}