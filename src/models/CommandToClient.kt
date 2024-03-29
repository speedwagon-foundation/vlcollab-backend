package models

import io.ktor.http.cio.websocket.Frame
import managers.Json

data class CommandToClient (
    var user: User,
    var callId: String,
    var data: String
) {
    fun toJsonFrame() = Frame.Text(Json.toJson(this))
}