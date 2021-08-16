package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.state.PreKeyBundle

class SnPreKeyBundle(
    registrationId: Int,
    deviceId: Int,
    preKeyId: Int,
    preKeyPublic: ECPublicKey?,
    signedPreKeyId: Int,
    signedPreKeyPublic: ECPublicKey?,
    signedPreKeySignature: ByteArray?,
    identityKey: IdentityKey?
) : PreKeyBundle(
    registrationId,
    deviceId,
    preKeyId,
    preKeyPublic,
    signedPreKeyId,
    signedPreKeyPublic,
    signedPreKeySignature,
    identityKey
) {

}