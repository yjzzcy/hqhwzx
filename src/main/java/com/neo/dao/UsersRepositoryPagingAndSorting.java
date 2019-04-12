package com.neo.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.neo.model.UserInfo;



/**
 * 
 *PagingAndSortingRepository接口
 *
 */

public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<UserInfo,Integer> {

}
