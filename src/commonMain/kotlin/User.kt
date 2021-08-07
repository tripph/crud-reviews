data class User(
    val username: String,
    val password: String,
    val roles: List<Role>
)
enum class Role {
    ADMIN
}
