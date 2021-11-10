import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class ObservableVetoable<T>(
    initialValue: T,
    val updatePrecondition: (old: T, new: T) -> Boolean,
    val updateListener: (old: T, new: T) -> Unit
) :
    ObservableProperty<T>(initialValue = initialValue) {
    override fun beforeChange(
        property: KProperty<*>,
        oldValue: T,
        newValue: T
    ): Boolean =
        updatePrecondition(oldValue, newValue)

    override fun afterChange(
        property: KProperty<*>,
        oldValue: T,
        newValue: T
    ) =
        updateListener(oldValue, newValue)
}