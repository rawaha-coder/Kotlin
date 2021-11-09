import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main() {
    println("\n*** Inlining Function code ***\n")

    performHavingLock(ReentrantLock()) {
        print("Wait for it!")
    }

}

inline fun performHavingLock(lock: Lock, task: () -> Unit){
    lock.lock()
    try {
        task()
    }finally {
        lock.unlock()
    }
}