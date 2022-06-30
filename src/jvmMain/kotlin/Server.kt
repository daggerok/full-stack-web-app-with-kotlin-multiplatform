import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val server = embeddedServer(Netty, 9090) {
        routing {
            get {
                call.respondText { "Hello!" }
            }
        }
    }
    server.start(wait = true)
}
