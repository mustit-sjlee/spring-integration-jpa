package com.example.springintegrationjpa.repository

import com.example.springintegrationjpa.repository.entity.MemberEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CrudRepository<MemberEntity, Long> {
}