package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepo;

    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberRepo.save(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepo.findAll();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable("id") String id) {
        return memberRepo.findById(id).orElse(null);
    }
}
