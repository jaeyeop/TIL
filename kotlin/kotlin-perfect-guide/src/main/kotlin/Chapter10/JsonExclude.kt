package Chapter10

// Java에서 사용하기 위해 AnnotationTarget.FIELD 정의
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.EXPRESSION)
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
//@Deprecated
@Suppress
annotation class JsonExclude
