package chap03.section4

import java.util.concurrent.locks.ReentrantLock


var sharable = 1

fun main() {
val reLock=ReentrantLock()
    lock(reLock,{ criticalFunc()})
    lock(reLock){ criticalFunc()}
    lock(reLock,::criticalFunc)

print(sharable)
}

fun criticalFunc() {
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {

        return body()
    } finally {
        reLock.lock()
    }

}
