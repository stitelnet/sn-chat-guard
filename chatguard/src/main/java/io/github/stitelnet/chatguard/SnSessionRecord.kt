package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.state.SessionRecord
import org.whispersystems.libsignal.state.SessionState
import java.io.IOException

class SnSessionRecord: SessionRecord {
    constructor() : super()
    constructor(sessionState: SessionState?) : super(sessionState)

    @Throws(IOException::class)
    constructor(serialized: ByteArray?) : super(serialized)


}