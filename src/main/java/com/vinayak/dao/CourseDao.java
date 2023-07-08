package com.vinayak.dao;

import com.vinayak.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<CourseEntity,Integer> {
}
