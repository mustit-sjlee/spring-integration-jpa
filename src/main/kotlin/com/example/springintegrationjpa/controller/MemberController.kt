package com.example.springintegrationjpa.controller

import com.example.springintegrationjpa.repository.MemberRepository
import com.example.springintegrationjpa.repository.entity.MemberEntity
import com.example.springintegrationjpa.service.MemberService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/member")
class MemberController(
  private val memberRepository: MemberRepository,
  private val memberService: MemberService
  ) {

  @GetMapping("/jpa")
  fun getMemberListByJpa() = memberRepository.findAll()

  @PostMapping("/jpa")
  fun signUpByJpa(@RequestBody memberEntity: MemberEntity)
  = try{
    memberRepository.save(memberEntity);
  } catch (e: Exception) {
    e.message
  }

  @GetMapping("/integration")
  fun getMemberListByIntegration() = memberService.findAllMember()

  @PostMapping("/integration")
  fun signUpByIntegration(@RequestBody memberEntity: MemberEntity)
  = try{
    memberService.createMember(memberEntity)
  } catch (e: Exception) {
    e.message
  }


}
