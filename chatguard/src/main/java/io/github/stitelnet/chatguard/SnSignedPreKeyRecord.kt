package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.ecc.ECKeyPair
import org.whispersystems.libsignal.state.SignedPreKeyRecord
import java.io.IOException

class SnSignedPreKeyRecord: SignedPreKeyRecord {
    constructor(id: Int, timestamp: Long, keyPair: ECKeyPair?, signature: ByteArray?) : super(
        id,
        timestamp,
        keyPair,
        signature
    )

    @Throws(IOException::class)
    constructor(serialized: ByteArray?) : super(serialized)

    override fun getId(): Int {
        return super.getId()
    }

    override fun getTimestamp(): Long {
        return super.getTimestamp()
    }

    override fun getKeyPair(): SnECKeyPair {
        return super.getKeyPair() as SnECKeyPair
    }

    override fun getSignature(): ByteArray {
        return super.getSignature()
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }
}