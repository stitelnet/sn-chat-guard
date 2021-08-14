package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.ecc.ECPublicKey

interface SnECPublicKey: ECPublicKey{
    override fun serialize(): ByteArray

    override fun getType(): Int
}