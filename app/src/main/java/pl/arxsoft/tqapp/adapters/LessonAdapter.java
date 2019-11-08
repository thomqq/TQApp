package pl.arxsoft.tqapp.adapters;

import java.util.List;

import pl.arxsoft.tqapp.lesson.model.LessonIdentity;

public interface LessonAdapter {
    List<LessonIdentity> getLessonsIdentityForUser(String userId);
}
