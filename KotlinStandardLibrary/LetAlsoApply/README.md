
# Extension functions – let, also, apply

## public inline fun <T, R> T.let(block: (T) -> R): R
## public inline fun <T> T.also(block: (T) -> Unit): T
## public inline fun <T> T.apply(block: T.() -> Unit): T
## public inline fun <T, R> T.run(block: T.() -> R): R
