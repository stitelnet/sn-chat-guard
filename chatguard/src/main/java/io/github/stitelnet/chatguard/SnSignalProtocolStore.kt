package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.state.SignalProtocolStore
import kotlin.Throws
import io.github.stitelnet.chatguard.SnInvalidKeyIdException
import io.github.stitelnet.chatguard.SnPreKeyRecord
import org.whispersystems.libsignal.state.PreKeyRecord
import org.whispersystems.libsignal.SignalProtocolAddress
import org.whispersystems.libsignal.state.SessionRecord
import io.github.stitelnet.chatguard.SnSignalProtocolAddress
import io.github.stitelnet.chatguard.SnSessionRecord
import io.github.stitelnet.chatguard.SnSignedPreKeyRecord
import org.whispersystems.libsignal.state.SignedPreKeyRecord
import io.github.stitelnet.chatguard.SnIdentityKeyPair
import org.whispersystems.libsignal.IdentityKey
import io.github.stitelnet.chatguard.SnIdentityKey
import org.whispersystems.libsignal.state.IdentityKeyStore

abstract class SnSignalProtocolStore : SignalProtocolStore {
    @Throws(SnInvalidKeyIdException::class)
    override fun loadPreKey(preKeyId: Int): SnPreKeyRecord? {
        return null
    }

    override fun storePreKey(preKeyId: Int, record: PreKeyRecord?) {
        storePreKey(preKeyId, record as SnPreKeyRecord?)
    }

    abstract fun storePreKey(preKeyId: Int, record: SnPreKeyRecord?)
    override fun containsPreKey(preKeyId: Int): Boolean {
        return false
    }

    override fun removePreKey(preKeyId: Int) {}
    override fun loadSession(address: SignalProtocolAddress?): SessionRecord {
        return loadSession(address as SnSignalProtocolAddress?)
    }

    abstract fun loadSession(address: SnSignalProtocolAddress?): SnSessionRecord
    override fun getSubDeviceSessions(name: String?): List<Int>? {
        return null
    }

    override fun storeSession(address: SignalProtocolAddress?, record: SessionRecord?) {
        storeSession(address as SnSignalProtocolAddress?, record as SnSessionRecord?)
    }

    abstract fun storeSession(address: SnSignalProtocolAddress?, record: SnSessionRecord?)
    override fun containsSession(address: SignalProtocolAddress?): Boolean {
        return containsSession(address as SnSignalProtocolAddress?)
    }

    abstract fun containsSession(address: SnSignalProtocolAddress?): Boolean
    override fun deleteSession(address: SignalProtocolAddress?) {
        deleteSession(address as SnSignalProtocolAddress?)
    }

    abstract fun deleteSession(address: SnSignalProtocolAddress?)
    override fun deleteAllSessions(name: String?) {}
    override fun loadSignedPreKey(signedPreKeyId: Int): SnSignedPreKeyRecord? {
        return null
    }

    override fun loadSignedPreKeys(): List<SignedPreKeyRecord> {
        return loadSignedPreKeyList()
    }

    abstract fun loadSignedPreKeyList(): List<SnSignedPreKeyRecord>

    override fun storeSignedPreKey(signedPreKeyId: Int, record: SignedPreKeyRecord?) {
        storeSignedPreKey(signedPreKeyId, record as SnSignedPreKeyRecord?)
    }

    abstract fun storeSignedPreKey(signedPreKeyId: Int, record: SnSignedPreKeyRecord?)
    override fun containsSignedPreKey(signedPreKeyId: Int): Boolean {
        return false
    }

    override fun removeSignedPreKey(signedPreKeyId: Int) {}
    override fun getIdentityKeyPair(): SnIdentityKeyPair? {
        return null
    }

    override fun getLocalRegistrationId(): Int {
        return 0
    }

    override fun saveIdentity(address: SignalProtocolAddress, identityKey: IdentityKey): Boolean {
        return saveIdentity(address as SnSignalProtocolAddress, identityKey as SnIdentityKey)
    }

    abstract fun saveIdentity(address: SnSignalProtocolAddress, identityKey: SnIdentityKey): Boolean

    override fun isTrustedIdentity(
        address: SignalProtocolAddress,
        identityKey: IdentityKey,
        direction: IdentityKeyStore.Direction
    ): Boolean {
        return isTrustedIdentity(
            address as SnSignalProtocolAddress,
            identityKey as SnIdentityKey,
            direction.ordinal
        )
    }

    abstract fun isTrustedIdentity(
        address: SnSignalProtocolAddress?,
        identityKey: SnIdentityKey?,
        direction: Int
    ): Boolean

    override fun getIdentity(address: SignalProtocolAddress): IdentityKey {
        return getIdentity(address as SnSignalProtocolAddress)
    }

    abstract fun getIdentity(address: SnSignalProtocolAddress): SnIdentityKey
}