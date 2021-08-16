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
import java.lang.Exception

abstract class SnSignalProtocolStore : SignalProtocolStore{
    override fun getIdentity(address: SignalProtocolAddress): IdentityKey? {
        return getIdentity(SnHelper.convertSignalProtocolAddress(address))
    }
    abstract fun getIdentity(address: SnSignalProtocolAddress): SnIdentityKey

    override fun isTrustedIdentity(
        address: SignalProtocolAddress,
        identityKey: IdentityKey,
        direction: IdentityKeyStore.Direction
    ): Boolean {
        return isTrustedIdentity(SnHelper.convertSignalProtocolAddress(address),
            SnHelper.convertIdentityKey(identityKey), direction.ordinal)
    }
    abstract fun isTrustedIdentity(
        address: SnSignalProtocolAddress?,
        identityKey: SnIdentityKey?,
        direction: Int
    ): Boolean

    override fun saveIdentity(address: SignalProtocolAddress, identityKey: IdentityKey): Boolean {
        return saveIdentity(SnHelper.convertSignalProtocolAddress(address), SnHelper.convertIdentityKey(identityKey))
    }
    abstract fun saveIdentity(address: SnSignalProtocolAddress, identityKey: SnIdentityKey?): Boolean

    override fun loadSession(address: SignalProtocolAddress): SessionRecord? {
        return loadSession(SnHelper.convertSignalProtocolAddress(address))
    }
    abstract fun loadSession(address: SnSignalProtocolAddress): SnSessionRecord

    override fun storeSession(address: SignalProtocolAddress, record: SessionRecord) {
        storeSession(SnHelper.convertSignalProtocolAddress(address), SnHelper.convertSessionRecord(record))
    }
    abstract fun storeSession(address: SnSignalProtocolAddress, record: SnSessionRecord)

    override fun containsSession(address: SignalProtocolAddress): Boolean {
        return containsSession(SnHelper.convertSignalProtocolAddress(address))
    }
    abstract fun containsSession(address: SnSignalProtocolAddress): Boolean

    override fun deleteSession(address: SignalProtocolAddress) {
        deleteSession(SnHelper.convertSignalProtocolAddress(address))
    }
    abstract fun deleteSession(address: SnSignalProtocolAddress)

    override fun storePreKey(preKeyId: Int, record: PreKeyRecord) {
        storePreKey(preKeyId, SnHelper.convertPreKeyRecord(record))
    }
    abstract fun storePreKey(preKeyId: Int, record: SnPreKeyRecord)

    override fun storeSignedPreKey(signedPreKeyId: Int, record: SignedPreKeyRecord) {
        storeSignedPreKey(signedPreKeyId, SnHelper.convertSignedPreKeyRecord(record))
    }
    abstract fun storeSignedPreKey(signedPreKeyId: Int, record: SnSignedPreKeyRecord)

    override fun loadSignedPreKeys(): MutableList<SignedPreKeyRecord> {
        return loadSignedPreKeyList().toMutableList()
    }
    abstract fun loadSignedPreKeyList(): MutableList<SnSignedPreKeyRecord>

    override fun loadSignedPreKey(signedPreKeyId: Int): SignedPreKeyRecord {
        return loadSnSignedPreKey(signedPreKeyId)
    }

    @Throws(Exception::class)
    abstract fun loadSnSignedPreKey(signedPreKeyId: Int): SnSignedPreKeyRecord

    override fun loadPreKey(preKeyId: Int): PreKeyRecord {
        return loadSnPreKey(preKeyId)
    }

    @Throws(Exception::class)
    abstract fun loadSnPreKey(preKeyId: Int): SnPreKeyRecord
}