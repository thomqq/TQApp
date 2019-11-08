package pl.arxsoft.tqapp.factories;

import java.util.ArrayList;
import java.util.List;

import pl.arxsoft.tqapp.adapters.LessonAdapter;
import pl.arxsoft.tqapp.adapters.UserAdapter;
import pl.arxsoft.tqapp.lesson.model.LessonIdentity;
import pl.arxsoft.tqapp.users.UserManager;
import pl.arxsoft.tqapp.users.model.LessonUser;

public class Factory {

    private static UserManager userManager;
    private static LessonManager lessonManager;

    public static UserManager getUserManager() {
        if (userManager == null) {
            userManager = new UserManager(createFakeUserAdapter());
        }
        return userManager;
    }

    private static UserAdapter createFakeUserAdapter() {
        return new UserAdapter() {
            @Override
            public List<LessonUser> getUser() {
                ArrayList<LessonUser> users = new ArrayList<>();
                users.add(new LessonUser("1", "Tomek"));
                users.add(new LessonUser("2", "Madzia"));
                return users;
            }
        };
    }

    public static LessonManager getLessonManager() {
        if (lessonManager == null) {
            lessonManager = new LessonManager(createFakeLessonAdapter());
        }
        return lessonManager;
    }

    private static LessonAdapter createFakeLessonAdapter() {
        return new LessonAdapter() {
            @Override
            public List<LessonIdentity> getLessonsIdentityForUser(String userId) {
                return createFakeLessonForUser(userId);
            }

            private List<LessonIdentity> createFakeLessonForUser(String userId) {
                ArrayList<LessonIdentity> lessons = new ArrayList<>();
                for(int i = 0 ; i < 5 ; ++i) {
                    lessons.add(new LessonIdentity(userId + "_" + i, "Lesson " + i));
                }
                return lessons;
            }
        };
    }

}