// IS_APPLICABLE: false
// LANGUAGE_VERSION: 1.3

fun Int.exec(f: (Int) -> Unit) = f(this)

fun bar(x: Int) = x

fun foo() {
    2.exec {<caret> bar(it) }
}
