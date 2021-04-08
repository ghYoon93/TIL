## Class

### Class

- 자바의 모든 클래스와 인터페이스는 컴파일 후 `.class` 확장자를 가진 파일이 생성 됨

- `Class` 클래스는 이 `.class` 파일을 가져와 객체를 동적으로 로드하고 클래스의정보를 가져오는 메서드를 제공
- `Class.forName("클래스 이름")` 메서드로 실행 중에 클래스를 동적으로 가져옴

### 동적 로딩

- 런타임 중에 데이터 타입을 바인딩하는방법
- 클래스를 찾지 못할 경우 실행 중 에러가 발생

### 클래스 가져오기

- `Class.forName("클래스 이름");`
- `클래스변수.newInstance();`
- `인스턴스.getClass();`

### 생성자 가져오기

- `Class`는 클래스의 생성자들을 가져오는 `getConstructors()` 메서드를 제공

### 메서드 가져오기

- `getMethods()` 메서드로 클래스의 메서드들을 가져올 수 있다.

### local에 클래스가 없을때 인스턴스생성 방법

1. 클래스를 가져온다.
2. 생성자의 파라미터 타입을 가져온다.
3. 파라미터 타입에 해당하는 생성자를 가져온다.

```java
// 1. 클래스를 가져온다.
Class class = Class.forName("클래스 이름");

// 2. 생성자의 파라미터 타입의 클래스를 설정한다.
Class[] parameterTypes = {클래스.class};

// 3. 파라미터 타입에 해당하는 생성자를 가져온다.
Constructor constructor = class.getConstructor(parameterTypes);

// 4. 생성자에 전달할 인자를 설정한다.
Object[] initArgs = {String 타입};

// 5. 인스턴스 생성
ClassType instance = (ClassType)constructor.newInstance(initArgs);
```
