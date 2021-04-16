## Bean Overview

- IoC 컨테이너는 하나 이상의 빈을 관리
- 빈은 설정 메타데이터로 생성

**빈 설정**

- 패키지와 클래스 네임

- 구현 클래스

- 빈의 동작 (scope, lifecycle, callback 등)

- 참조

- 다른 설정 (property 등)

**빈 네이밍**

- 빈은 하나 이상의 식별자를 가져야함
- XML 기반 설정 메타데이터에서는 `id` 속성과 `name` 속성으로 식별자 지정
- `name` 속성은 컴마(,)나 세미콜론(;)으로 여러 이름을 지정할 수 있음

**왜 식별자가 필요하나?**

- 같은 클래스라도 스프링이 관리해야할 빈이 다를 수 있다.

### 빈의 인스턴스화

- 생성자
- 스태틱 팩토리 메서드
- 인스턴스 팩토리 메서드

기본적으로 설정 메타데이터에서 생성자를 이용해 빈의 인스턴스를 생성

**스태틱 팩토리 메서드**

```java
public static Dao createDao() {
    return new Dao();
}
```

```xml
<bean
      id="dao"
      name="dao1, dao2, dao3"
      class="kr.co.fastcampus.cli.Dao"
      factory-method="createDao" />
```

**인스턴스 팩토리 메서드**

**필요한 빈**

- 팩토리빈
- 팩토리빈에서 생성되는 빈

```java
public class DaoFactory {
    public Dao createDao() {
        return new Dao();
    }
}
```

```xml
<bean
      id="daoFactory"
      class="kr.co.fastcampus.cli.DaoFactory" />
<bean
      id="dao"
      class="kr.co.fastcampus.cli.Dao"
      fatory-bean="daoFactory"
      fatory-method="createDao" />
```
