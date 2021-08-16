package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.*
import org.whispersystems.libsignal.protocol.CiphertextMessage
import org.whispersystems.libsignal.state.*

class SnSessionCipher: SessionCipher {
    constructor(
        sessionStore: SessionStore?,
        preKeyStore: PreKeyStore?,
        signedPreKeyStore: SignedPreKeyStore?,
        identityKeyStore: IdentityKeyStore?,
        remoteAddress: SignalProtocolAddress?
    ) : super(sessionStore, preKeyStore, signedPreKeyStore, identityKeyStore, remoteAddress)

    constructor(store: SignalProtocolStore?, remoteAddress: SignalProtocolAddress?) : super(
        store,
        remoteAddress
    )




}