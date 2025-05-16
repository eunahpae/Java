package com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers() {

        return MemberRepository.findAllMembers();
    }
}
