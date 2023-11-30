 ## 📌 API 문서

[Toy Project 3 API 문서](https://gifted-feet-c42.notion.site/Toy-Project-3-API-78055894df504505ad73b39e83f1676d#876ccfd66857429fa05a5227bc0eecca)

## 📌 Postman 실행 화면

[Postman 실행 화면](https://www.notion.so/3-f57a1bb8dc244d859db99d4768402b23?p=4fe16400b0944d15b258fe64cb9b041b&pm=s)

## 📌 세부 기능 구현

### 1. 사용자 인증 API 구현

#### 1-1. 회원가입

* 로그인
* 로그아웃
* 토큰 재발급

#### 1-2. 사용자 API 구현

* 로그인한 사용자 정보 조회
* 멤버 탈퇴

### 2. 댓글 기능 구현

#### 2-1. 댓글 등록

* 로그인한 회원은 각 여행에 댓글을 등록하고 저장
* 등록한 댓글은 여행의 tripList로 저장
* 조회 시 N+1 문제를 해결하기 위하여 FETCH JOIN 사용
* 모든 사람이 모든 여행에 댓글 작성 가능

#### 2-2. 댓글 조회 (사용자별)

* 본인이 작성한 댓글만 모아서 조회 가능(마이페이지)
* 다른 사람이 작성한 댓글은 조회 불가능(다른 사람 마이페이지에 접근 불가)

#### 2-3. 댓글 삭제

* 본인이 작성한 댓글은 삭제 가능
* 다른 사람이 작성한 댓글은 삭제 불가능

#### 2-4. 댓글 수정

* 댓글 삭제와 동일

### 3. 좋아요 기능 구현

#### 3-1. 좋아요 추가 기능

* 자신의 여행에 좋아요 추가
* 다른 사람의 여행에 좋아요 추가
* 이미 좋아요를 추가했다면 좋아요 추가 불가능

#### 3-2. 좋아요 삭제 기능

* 자신이 좋아요 했던 여행에 대한 좋아요 삭제
* 이미 해당 좋아요를 삭제했다면 좋아요 삭제 불가능

#### 3-3. 자신이 좋아요 누른 여행 목록 조회

* 자신이 좋아요 했던 여행 목록 조회
* 여행 정보 리스트로 출력

#### 3-4. 여행조회시 해당 여행에 대한 좋아요 수도 함께 조회
* 여행 엔티티에서 참조하는 좋아요 리스트의 Batch Size를 100 으로 설정
* 쿼리 실행 시 WHERE 절의 IN 조건을 사용하여 N+1 문제를 해결 

### 4. 검색 기능 및 Open API 활용 위치 정보 표현 및 인가 관리

#### 4-1. 위치 정보 표현

* 오픈 API를 활용하여 위치 정보 표현

#### 4-2. 인가 관리

* 여행 및 여정 조작 시 인증된 회원에 따른 인가 관리

#### 4-3. 검색기능

* 전체 여행 조회 시 검색조건(여행 이름)으로 특정 여행 조회

## 📌 ERD

![image](https://github.com/FC-BE-ToyProject-Team3/KDT_Y_BE_Toy_Project3/assets/139152515/a3cc7c0b-f550-46ff-b519-0c2ad081f159)
