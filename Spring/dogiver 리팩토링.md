# dogiver 리팩토링

cart와 order 분리

### cart

* 장바구니 id, (auto_increment)
* 회원 이메일,  (session)
* 상품 구매 수량, 
* 회원 id, 등록일,  
* 수정일 



# Controller test

### 테스트에 필요한 의존성 추가하기

* org.springframework.spring-test:5.1.0.RELEASE
* junit.junit:4.12.RELEASE
* org.assertj.assertj-core:3.11.1.RELEASE
* org.hamcrest.hamecrest-core:2.2.RELEASE
* org.mockito.mockito-core:2.23.4.RELEASE
* org.jayway.jsonpath.json-path:2.4.0.RELEASE



### 테스트 클래스 작성

