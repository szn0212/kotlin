// Functions can be recursively annotated
annotation class ann(val x: Int)
@ann(<!ANNOTATION_PARAMETER_MUST_BE_CONST!>bar()<!>) fun foo() = 1
@ann(<!ANNOTATION_PARAMETER_MUST_BE_CONST!>foo()<!>) fun bar() = 2