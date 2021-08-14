package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.LegacyMessageException
import java.lang.Exception

class SnLegacyMessageException(s: String?) : Exception(s) {
}