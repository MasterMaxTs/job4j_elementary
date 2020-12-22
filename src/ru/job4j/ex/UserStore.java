package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] user, String login) throws UserNotFoundException {
        User rsl = null;
        for (User us: user) {
            if (us.getUsername().equals(login)) {
                rsl = us;
            }
        } if (rsl == null) {
            throw new UserNotFoundException("UserNotFoundException");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException{
        boolean valid = true;
        if(user.isValid() == false || user.getUsername().length() <= 3) {
            throw new UserInvalidException("UserInvalidException");
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = { new User("Maxim Tsurkanov", true),
                         new User("Ivan Petrov", false),
                         new User("Radion", true),
                         new User("Sergey Ivanov", true)
        };
        String login = "Ivan Petrov";
        try {
            User user = findUser(users, login);
            if (validate(user)) {
                System.out.println("User is " + user.getUsername() + " has an access");
            }
        } catch (UserInvalidException ev) {
            System.out.println("User with login is " + login + " doesn't valid!");
        } catch (UserNotFoundException eu) {
            System.out.println("User with login is " + login + " doesn't found!");
        }
    }
}
