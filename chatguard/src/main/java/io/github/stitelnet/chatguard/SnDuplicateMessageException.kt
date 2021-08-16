package io.github.stitelnet.chatguard

import org.whispersystems.libsignal.DuplicateMessageException
import java.lang.Exception

class SnDuplicateMessageException(s: String) : DuplicateMessageException(s) {

}