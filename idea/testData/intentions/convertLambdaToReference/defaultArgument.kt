// IS_APPLICABLE: false
// LANGUAGE_VERSION: 1.3

fun foo(z: Int, y: Int = 0) = y + z

val x = { arg: Int <caret>-> foo(arg) }