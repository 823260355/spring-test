package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.RsEventDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RsEventRepository extends CrudRepository<RsEventDto, Integer> {
  @Query(nativeQuery = true, value = "select * from rsevent order by vote_num asc")
  List<RsEventDto> findAllOrderByVoteNumAsc();

  @Transactional
  void deleteAllByUserId(int userId);
}
