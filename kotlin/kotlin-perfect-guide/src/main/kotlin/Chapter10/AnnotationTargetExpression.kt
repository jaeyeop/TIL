package Chapter10

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.EXPRESSION)
annotation class TA_expression

val name: String = @TA_expression "annotation for expression"


