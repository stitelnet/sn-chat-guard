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


}