package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.ecc.ECKeyPair
import org.whispersystems.libsignal.state.PreKeyRecord
import java.io.IOException

class SnPreKeyRecord: PreKeyRecord {
    constructor(id: Int, keyPair: ECKeyPair?) : super(id, keyPair)
    @Throws(IOException::class)
    constructor(serialized: ByteArray?) : super(serialized)

    override fun getId(): Int {
        return super.getId()
    }

    override fun getKeyPair(): SnECKeyPair {
        return super.getKeyPair() as SnECKeyPair
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }
}