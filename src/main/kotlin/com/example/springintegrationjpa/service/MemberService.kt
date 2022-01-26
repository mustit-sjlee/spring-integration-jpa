package com.example.springintegrationjpa.service

import com.example.springintegrationjpa.repository.entity.MemberEntity

interface MemberService {

  fun createMember(memberEntity: MemberEntity) : MemberEntity
  fun findAllMember() : List<MemberEntity>

}