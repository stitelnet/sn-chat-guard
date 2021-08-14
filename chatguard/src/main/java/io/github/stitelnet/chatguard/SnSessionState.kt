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

    override fun getStructure(): StorageProtos.SessionStructure {
        return super.getStructure()
    }

    override fun getAliceBaseKey(): ByteArray {
        return super.getAliceBaseKey()
    }

    override fun setAliceBaseKey(aliceBaseKey: ByteArray?) {
        super.setAliceBaseKey(aliceBaseKey)
    }

    override fun setSessionVersion(version: Int) {
        super.setSessionVersion(version)
    }

    override fun getSessionVersion(): Int {
        return super.getSessionVersion()
    }

    override fun setRemoteIdentityKey(identityKey: IdentityKey?) {
        super.setRemoteIdentityKey(identityKey)
    }

    override fun setLocalIdentityKey(identityKey: IdentityKey?) {
        super.setLocalIdentityKey(identityKey)
    }

    override fun getRemoteIdentityKey(): SnIdentityKey {
        return super.getRemoteIdentityKey() as SnIdentityKey
    }

    override fun getLocalIdentityKey(): SnIdentityKey {
        return super.getLocalIdentityKey() as SnIdentityKey
    }

    override fun getPreviousCounter(): Int {
        return super.getPreviousCounter()
    }

    override fun setPreviousCounter(previousCounter: Int) {
        super.setPreviousCounter(previousCounter)
    }

    override fun getRootKey(): RootKey {
        return super.getRootKey()
    }

    override fun setRootKey(rootKey: RootKey?) {
        super.setRootKey(rootKey)
    }

    override fun getSenderRatchetKey(): SnECPublicKey {
        return super.getSenderRatchetKey() as SnECPublicKey
    }

    override fun getSenderRatchetKeyPair(): SnECKeyPair {
        return super.getSenderRatchetKeyPair() as SnECKeyPair
    }

    override fun hasReceiverChain(senderEphemeral: ECPublicKey?): Boolean {
        return super.hasReceiverChain(senderEphemeral)
    }

    override fun hasSenderChain(): Boolean {
        return super.hasSenderChain()
    }

    override fun getReceiverChainKey(senderEphemeral: ECPublicKey?): ChainKey {
        return super.getReceiverChainKey(senderEphemeral)
    }

    override fun addReceiverChain(senderRatchetKey: ECPublicKey?, chainKey: ChainKey?) {
        super.addReceiverChain(senderRatchetKey, chainKey)
    }

    override fun setSenderChain(senderRatchetKeyPair: ECKeyPair?, chainKey: ChainKey?) {
        super.setSenderChain(senderRatchetKeyPair, chainKey)
    }

    override fun getSenderChainKey(): ChainKey {
        return super.getSenderChainKey()
    }

    override fun setSenderChainKey(nextChainKey: ChainKey?) {
        super.setSenderChainKey(nextChainKey)
    }

    override fun hasMessageKeys(senderEphemeral: ECPublicKey?, counter: Int): Boolean {
        return super.hasMessageKeys(senderEphemeral, counter)
    }

    override fun removeMessageKeys(senderEphemeral: ECPublicKey?, counter: Int): MessageKeys {
        return super.removeMessageKeys(senderEphemeral, counter)
    }

    override fun setMessageKeys(senderEphemeral: ECPublicKey?, messageKeys: MessageKeys?) {
        super.setMessageKeys(senderEphemeral, messageKeys)
    }

    override fun setReceiverChainKey(senderEphemeral: ECPublicKey?, chainKey: ChainKey?) {
        super.setReceiverChainKey(senderEphemeral, chainKey)
    }

    override fun setPendingKeyExchange(
        sequence: Int,
        ourBaseKey: ECKeyPair?,
        ourRatchetKey: ECKeyPair?,
        ourIdentityKey: IdentityKeyPair?
    ) {
        super.setPendingKeyExchange(sequence, ourBaseKey, ourRatchetKey, ourIdentityKey)
    }

    override fun getPendingKeyExchangeSequence(): Int {
        return super.getPendingKeyExchangeSequence()
    }

    override fun getPendingKeyExchangeBaseKey(): ECKeyPair {
        return super.getPendingKeyExchangeBaseKey()
    }

    override fun getPendingKeyExchangeRatchetKey(): ECKeyPair {
        return super.getPendingKeyExchangeRatchetKey()
    }

    override fun getPendingKeyExchangeIdentityKey(): IdentityKeyPair {
        return super.getPendingKeyExchangeIdentityKey()
    }

    override fun hasPendingKeyExchange(): Boolean {
        return super.hasPendingKeyExchange()
    }

    override fun setUnacknowledgedPreKeyMessage(
        preKeyId: Optional<Int>?,
        signedPreKeyId: Int,
        baseKey: ECPublicKey?
    ) {
        super.setUnacknowledgedPreKeyMessage(preKeyId, signedPreKeyId, baseKey)
    }

    override fun hasUnacknowledgedPreKeyMessage(): Boolean {
        return super.hasUnacknowledgedPreKeyMessage()
    }

    override fun getUnacknowledgedPreKeyMessageItems(): UnacknowledgedPreKeyMessageItems {
        return super.getUnacknowledgedPreKeyMessageItems()
    }

    override fun clearUnacknowledgedPreKeyMessage() {
        super.clearUnacknowledgedPreKeyMessage()
    }

    override fun setRemoteRegistrationId(registrationId: Int) {
        super.setRemoteRegistrationId(registrationId)
    }

    override fun getRemoteRegistrationId(): Int {
        return super.getRemoteRegistrationId()
    }

    override fun setLocalRegistrationId(registrationId: Int) {
        super.setLocalRegistrationId(registrationId)
    }

    override fun getLocalRegistrationId(): Int {
        return super.getLocalRegistrationId()
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }
}