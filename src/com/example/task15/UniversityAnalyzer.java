package com.example.task15;



import com.example.task15.model.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniversityAnalyzer {
    /**
     * Should return min subject mark
     *
     * @param students  students stream
     * @param subjectId find min mark for subject with such id
     * @return
     */
    public OptionalInt getMinSubjectMark(Stream<Student> students, int subjectId) {
        return students.flatMap(student -> student.getSubjectMarks().stream())
                .filter(subjectMark -> subjectMark.getSubjectId() == subjectId)
                .mapToInt(SubjectMark::getMark).min();
    }

    /**
     * Should return average mark given by teacher
     *
     * @param students  students stream
     * @param teacherId find average given mark for teacher with such id
     * @return
     */
    public OptionalDouble getAverageTeacherMark(Stream<Student> students, int teacherId) {
        return students.flatMap(student -> student.getSubjectMarks().stream())
                .filter(subjectMark -> subjectMark.getTeacherId() == teacherId)
                .mapToInt(SubjectMark::getMark).average();
    }

    /**
     * Should return min students age (years). Need to count the number of full years.
     *
     * @param students not empty students stream
     * @return
     */
    public Integer getMinStudentAgeInYears(Stream<Student> students) {
        return students.mapToInt(student -> Period.between(student.getBirthday(), LocalDate.now()).getYears())
                .min().getAsInt();
    }

    /**
     * Should return student with highest average mark.
     * If two or more students have the same average mark, then return any of this students.
     *
     * @param students not empty students stream
     * @return
     */
    public Student getStudentWithHighestAverageMark(Stream<Student> students) {

        Map<Student, Double> studentAverages = new HashMap<>();

        students.forEach(student -> {
            double average = student.getSubjectMarks().stream()
                    .mapToInt(SubjectMark::getMark)
                    .average().getAsDouble();
            studentAverages.put(student, average);
        });
        Double highestAverageMark = studentAverages.values().stream()
                .mapToDouble(Double::doubleValue)
                .max().getAsDouble();
        return studentAverages.entrySet()
                .stream()
                .filter(entry -> highestAverageMark.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
    }

    /**
     * Return sorted students list.
     * If two students have the same count of marks, then students should be ordered by surname
     *
     * @param students students stream
     * @return
     */
    public List<Student> sortStudentsByCountOfMarks(Stream<Student> students) {
        Map<Student, Double> studentCountMarks = new HashMap<>();

        students.forEach(student -> {
            double sumMarks = student.getSubjectMarks().stream()
                    .mapToInt(SubjectMark::getMark)
                    .sum();
            studentCountMarks.put(student, sumMarks);
        });

        Comparator<Map.Entry<Student, Double>> comparator = (o1, o2) -> {
            int i = o1.getValue().compareTo(o2.getValue());
            if (i == 0) {
                return o1.getKey().getSurname().compareTo(o2.getKey().getSurname());
            } else {
                return i;
            }
        };
        return studentCountMarks.entrySet().stream()
                .sorted(comparator)
                .map(Map.Entry::getKey)
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                    Collections.reverse(l);
                    return l;
                }));
    }

    /**
     * Should return IDs of subjects sorted by academic performance in ascending order.
     *
     * @param students students stream
     * @return
     */
    public List<Integer> getSubjectsByAcademicPerformance(Stream<Student> students) {
        return students.flatMap(student -> student.getSubjectMarks().stream()).
                collect(Collectors.groupingBy(
                        SubjectMark::getSubjectId,
                        Collectors.averagingDouble(SubjectMark::getMark))
                )
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * Should return the subject that most teachers lead.
     * If two or more subject lead the same count of teacher, then return any of this subjects.
     *
     * @param teachers not empty teachers stream
     * @return
     */
    public Subject getSubjectThatMostTeachersLead(Stream<Teacher> teachers) {
        Map<Subject, Long> mapSubjectAndCount = teachers.flatMap(teacher -> teacher.getTaughtSubjects().stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return mapSubjectAndCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .skip(mapSubjectAndCount.entrySet().size() - 1)
                .findAny().get().getKey();
    }

    /**
     * Should sort excellent students by surname.
     * A student is considered an excellent student if his average mark is at least 8.
     * A student is considered a graduate if his age is not less than 21.
     *
     * @param students students stream
     * @return
     */
    public List<Student> getGraduatedExcellentStudents(Stream<Student> students) {

        return students.filter((student) -> (Period.between(student.getBirthday(),
                        LocalDate.now()).getYears()) >= 21)
                .filter(student -> (student.getSubjectMarks().stream()
                        .mapToInt(SubjectMark::getMark)
                        .average().getAsDouble() >= 8))
                .sorted(Comparator.comparing(Student::getSurname))
                .collect(Collectors.toList());
    }

    /**
     * Should return the head of the a department whose students have the highest average mark.
     * If students from two or more departments have the same average mark, then return any head of this departments.
     *
     * @param departments not empty departments stream
     * @return
     */
    public Teacher getHeadOfTheMostSuccessfulDepartment(Stream<Department> departments) {
        Map<Department, Double> departmentAverage = new HashMap<>();
        departments.forEach(department -> {
            double average = department.getStudents().stream()
                    .mapToDouble(student -> student.getSubjectMarks().stream()
                            .mapToInt(SubjectMark::getMark)
                            .average().getAsDouble()).average().getAsDouble();
            departmentAverage.put(department, average);
        });

        Double highestAverageMark = departmentAverage.values().stream()
                .mapToDouble(Double::doubleValue)
                .max().getAsDouble();
        Department department = departmentAverage.entrySet()
                .stream()
                .filter(entry -> highestAverageMark.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
        return department.getHead();
    }

    /**
     * Should return subjects list that head teaches in his department.
     *
     * @param department find corresponding subjects for this department
     * @return
     */
    public List<Subject> getSubjectsThatHeadTeachesInHisDepartment(Department department) {

        List<Integer> listSubjectID = department.getStudents().stream()
                .flatMap(student -> student.getSubjectMarks().stream())
                .filter(subjectMark -> ((Integer) subjectMark.getTeacherId()).equals(department.getHead().getId()))
                .map(subjectMark -> subjectMark.getSubjectId()).collect(Collectors.toList());

        return department.getSubjects().stream()
                .filter(subject -> listSubjectID.contains(subject.getId())).collect(Collectors.toList());
    }
}
