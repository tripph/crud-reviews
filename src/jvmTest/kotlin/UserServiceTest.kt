import org.junit.jupiter.api.Test

class UserServiceTest {
    @Test
    fun adminUserCanAddOtherUsers() {
        UserService.addUser(User(username="admin",password="password",roles = listOf(Role.ADMIN)))
    }
}
