package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository <Course,Long>{

    //find all course by category
    List<Course> findByCategory(String Category);

    //find all courses by category and order the entities by name
    List<Course>findByCategoryOrderByName(String Category);

    //checks if a course with the provided name exists. return true if course exists, otherwise false.
    boolean existsByName(String name);

    //returns the count of courses for the provided category
    int countByCategory(String Category);

    //find all courses that start with the provided course name
    List<Course>findByNameStartsWith(String name);

    //find all courses by category and returns a stream
    Stream<Course> streamByCategory(String Category);

    @Query("SELECT c from Course c where c.category = :category and c.rating > :rating")
    List<Course> findAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);
}
