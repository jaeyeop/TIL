# Generic
### 9.1.1 Generic 선언
- 상위 클래스 생성자에 대한 위임 호출은 컴파일러가 타입 인자를 추론할 수 없음
- 타입 파라미터를 상속하지 않음
- 프로퍼티나 함수에 타입 파라미터를 추가하면 프로퍼티나 함수 자체를 제네릭으로 만들 수 있다.
  - 하지만, 확장 함수/프로퍼티만 타입 파라미터를 가질 수 있다.
- 제네릭 프로퍼티의 타입 파라미터는 수신 객체 타입으로부터 추론되어야 한다.
<hr>

### 9.1.2 바운드와 제약
- ㅁㅁ