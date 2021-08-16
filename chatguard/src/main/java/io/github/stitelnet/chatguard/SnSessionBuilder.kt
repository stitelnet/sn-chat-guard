package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidKeyException
import org.whispersystems.libsignal.SessionBuilder
import org.whispersystems.libsignal.SignalProtocolAddress
import org.whispersystems.libsignal.UntrustedIdentityException
import org.whispersystems.libsignal.state.*

class SnSessionBuilder: SessionBuilder {
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