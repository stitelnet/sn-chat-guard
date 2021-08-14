package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.ecc.ECPrivateKey

interface SnECPrivateKey: ECPrivateKey {
    override fun serialize(): ByteArray

    override fun getType(): Int

}