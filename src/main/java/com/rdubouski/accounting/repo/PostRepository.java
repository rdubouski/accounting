package com.rdubouski.accounting.repo;

import com.rdubouski.accounting.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
