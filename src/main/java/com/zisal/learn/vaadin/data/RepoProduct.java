package com.zisal.learn.vaadin.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * Created by Ladies Man on 5/19/2016.
 */
@Repository
public interface RepoProduct extends PagingAndSortingRepository<EntityProduct, BigInteger> {
}
