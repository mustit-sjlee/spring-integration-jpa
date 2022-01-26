package com.example.springintegrationjpa.repository.entity

import javax.persistence.*

@Entity
@Table(name="member")
class MemberEntity (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_no", nullable = false)
  var memberNo: Long = 0,

  @Column(name = "id", nullable = false)
  var userId: String,

  @Column(name = "name", nullable = false)
  var name: String,

  )