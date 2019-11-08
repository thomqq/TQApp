package pl.arxsoft.tqapp.factories;

import java.util.List;

import pl.arxsoft.tqapp.adapters.LessonAdapter;
import pl.arxsoft.tqapp.lesson.model.LessonIdentity;

public class LessonManager {

    private final LessonAdapter lessonAdapter;

    public LessonManager(LessonAdapter lessonAdapter) {
        this.lessonAdapter = lessonAdapter;
    }
    List<LessonIdentity> getLessonIdentityForUser(String userId) {
        return lessonAdapter.getLessonsIdentityForUser(userId);
    }
}
