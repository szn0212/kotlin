fun foo(<!UNRESOLVED_REFERENCE, DEPRECATED_UNESCAPED_ANNOTATION!>varargs<!> <!UNUSED_PARAMETER!>f<!> : Int) {}

var bar : Int = 1
  set(<!UNRESOLVED_REFERENCE!>varargs<!> v) {}

val x : (Int) -> Int = {<!UNRESOLVED_REFERENCE!>@varargs<!> <!TYPE_MISMATCH!>x<!> <!DEPRECATED_STATIC_ASSERT!>: Int<!> <!SYNTAX!>-> x<!>}

class Hello(<!UNRESOLVED_REFERENCE, DEPRECATED_UNESCAPED_ANNOTATION!>varargs<!> <!UNUSED_PARAMETER!>args<!>: Any) {
}