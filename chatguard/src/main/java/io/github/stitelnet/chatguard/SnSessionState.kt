package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.IdentityKeyPair
import org.whispersystems.libsignal.ecc.ECKeyPair
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.ratchet.ChainKey
import org.whispersystems.libsignal.ratchet.MessageKeys
import org.whispersystems.libsignal.ratchet.RootKey
import org.whispersystems.libsignal.state.SessionState
import org.whispersystems.libsignal.state.StorageProtos
import org.whispersystems.libsignal.util.guava.Optional

class SnSessionState: SessionState {
    constructor() : super()
    constructor(sessionStructure: StorageProtos.SessionStructure?) : super(sessionStructure)
    constructor(copy: SessionState?) : super(copy)


}