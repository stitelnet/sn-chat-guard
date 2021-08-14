package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.state.SessionRecord
import org.whispersystems.libsignal.state.SessionState
import java.io.IOException

class SnSessionRecord: SessionRecord {
    constructor() : super()
    constructor(sessionState: SessionState?) : super(sessionState)

    @Throws(IOException::class)
    constructor(serialized: ByteArray?) : super(serialized)

    override fun hasSessionState(version: Int, aliceBaseKey: ByteArray?): Boolean {
        return super.hasSessionState(version, aliceBaseKey)
    }

    override fun getSessionState(): SnSessionState {
        return super.getSessionState() as SnSessionState
    }

    override fun getPreviousSessionStates(): MutableList<SessionState> {
        return super.getPreviousSessionStates()
    }

    override fun removePreviousSessionStates() {
        super.removePreviousSessionStates()
    }

    override fun isFresh(): Boolean {
        return super.isFresh()
    }

    override fun archiveCurrentState() {
        super.archiveCurrentState()
    }

    override fun promoteState(promotedState: SessionState?) {
        super.promoteState(promotedState)
    }

    override fun setState(sessionState: SessionState?) {
        super.setState(sessionState)
    }

    override fun serialize(): ByteArray {
        return super.serialize()
    }
}