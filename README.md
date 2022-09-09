# 프로젝트 소개
스파르타 코딩캠프 6주간 진행되는 [동네한판] 프로젝트 Server GitHub 입니다.

- 개발 인원 : 3명
- 개발 기간 : 2022.08.26 ~
- 주요 기능 : 
  - Jwt 통한 로그인/회원가입
  - CRUD 기능
  - STOMP Websocket 이용한 매칭된 사용자간의 채팅
  
---
   
## 개발환경 및 배포환경
- 개발 언어 : Java 11
- 개발 환경 : SpringBoot 2.6.11, Graddle, Spring Data JPA, Spring Security, MySQL


---

## DB 설계

![image](https://user-images.githubusercontent.com/86644517/189128656-792b52b7-9cc9-4a31-8cd2-b1ad597a7a57.png)

![image](https://user-images.githubusercontent.com/86644517/189131470-b0e151b9-8e84-4c59-82ae-3d70e44dfecf.png)

![image](https://user-images.githubusercontent.com/86644517/189131517-f92323a9-1448-4382-8ce5-11c295ef75aa.png)

![image](https://user-images.githubusercontent.com/86644517/189131564-96114a7c-d5ed-4f88-a6c1-9e9eae5baddb.png)

![image](https://user-images.githubusercontent.com/86644517/189131630-5933b72a-2bf0-4815-9a40-3749dcaea865.png)

![image](https://user-images.githubusercontent.com/86644517/189131674-55c0d4ec-013f-4cba-a4a5-591b66c42512.png)

![image](https://user-images.githubusercontent.com/86644517/189131728-d823bf76-d10b-401e-b9fe-722cc157060a.png)

![image](https://user-images.githubusercontent.com/86644517/189132199-77572f44-b215-42c2-9da2-6200a98d5e14.png)

---

## 요구사항 분석

1. 회원 가입 페이지

- 유효성 검사
- 중복 확인

2. 로그인 페이지

- 로그인 검사

3. 모집글 작성

- 로그인 여부 확인
- 게시글 작성 및 수정시 공백으로 작성하지 않도록 하기
- 작성자만이 게시글을 삭제할 수 있게 하기 
- 작성된 게시물은 비회원도 확인 가능

4. 모집 신청

- 로그인 했을 때 신청할 수 있도록 하기
- 유저가 모집글을 보고 신청을 하면 해당 매치의 호스트에게 알림이 가도록 하기
- 호스트는 신청한 유저의 정보와 Comment를 토대로 수락/거절 할 수 있음
- 최대 모집 인원이 초과된 매치에는 신청할 수 없도록 하기
- 이미 소속된 매치에는 신청할 수 없도록 하기

5. 모집 완료, 결과 입력

- 호스트가 설정한 인원수가 모두 채워질경우 [모집 완료]로 변경됨
- 정해진 약속시간으로부터 24시간이 지나면 해당 매치는 자동으로 모집 마감
- 결과 입력을 통해 매치에서 획득한 나의 점수를 입력할 수 있음(입력된 점수는 랭킹에 반영)
- 같이 경기를 한 유저에게 리뷰를 남길 수 있음

6. 마이페이지

- 프로필 이미지를 설정할 수 있도록 하기
- 스포츠별 내가 획득한 점수와 매치목록을 확인할 수 있도록 하기

## API 리스트

API명세서는 Swagger를 통해 작성했습니다.
http://54.197.65.103/swagger-ui.html

## 트러블 슈팅
