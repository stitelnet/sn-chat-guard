package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.IdentityKey
import org.whispersystems.libsignal.ecc.ECPublicKey
import org.whispersystems.libsignal.state.PreKeyBundle

class SnPreKeyBundle(
    registrationId: Int,
    deviceId: Int,
    preKeyId: Int,
    preKeyPublic: SnECPublicKey?,
    signedPreKeyId: Int,
    signedPreKeyPublic: SnECPublicKey?,
    signedPreKeySignature: ByteArray?,
    identityKey: SnIdentityKey?
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
    override fun getDeviceId(): Int {
        return super.getDeviceId()
    }

    override fun getPreKeyId(): Int {
        return super.getPreKeyId()
    }

    override fun getPreKey(): SnECPublicKey {
        return super.getPreKey() as SnECPublicKey
    }

    override fun getSignedPreKeyId(): Int {
        return super.getSignedPreKeyId()
    }

    override fun getSignedPreKey(): SnECPublicKey {
        return super.getSignedPreKey() as SnECPublicKey
    }

    override fun getSignedPreKeySignature(): ByteArray {
        return super.getSignedPreKeySignature()
    }

    override fun getIdentityKey(): SnIdentityKey {
        return super.getIdentityKey() as SnIdentityKey
    }

    override fun getRegistrationId(): Int {
        return super.getRegistrationId()
    }
}