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

    constructor(store: SnSignalProtocolStore?, remoteAddress: SnSignalProtocolAddress?) : super(
        store,
        remoteAddress
    )

    @Throws(SnInvalidKeyException::class, SnUntrustedIdentityException::class)
    fun process(preKeyBundle: SnPreKeyBundle){
        try {
            super.process(preKeyBundle)
        }
        catch (i: InvalidKeyException){
            throw i
        }
        catch (u: UntrustedIdentityException){
            throw u
        }
    }

}