object UserService {
    private val users = hashMapOf<String,User>()
    fun addUser(user: User) {
        users[user.username] = user
    }
}
