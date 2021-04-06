## Object

`Object`는 모든 클래스의 최상위 클래스이다.

풀네임은 `java.lang.Object`

모든 클래스는 `Object`의 몇몇 메서드를 재정의할 수 있다.

## 재정의할 수 있는 Object의 메서드

### toString()

- 객체의 주소를 나타냄

- 주소 대신 사용자에게 객체의 정보를 나타낼 때 재정의

### hashCode():int

- 객체가 저장된 힙메모리의 주소를 반환

### equals(obj:Object):boolean

- 파라미터의 객체와 주소 값을 비교하여 true나 false를 반환
- 주소가 다르더라도 논리적으로 동일할 경우 같다는 것을 나타낼 때 재정의
- equals()를 재정의했다면 hashCode()도 재정의하여 동일한 hashCode 값이 반환되도록 해야함.

### clone():Object

- 객체의 원본의 복제를 반환
- 객체지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
- 사용 시 `Cloneable` 인터페이스를 명시

### finalize():void

- 객체가 더이상 사용되지 않을 때 GC가 객체를 소멸하기 위해 호출하는 메서드
