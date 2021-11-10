class Member(val currentRentals: List<Rentable>,
             name: String,
             isActive: Boolean,
             user: User) : User by user