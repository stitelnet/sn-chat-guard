package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.InvalidVersionException
import java.lang.Exception

class SnInvalidVersionException(detailMessage: String?) : Exception(detailMessage) {
}