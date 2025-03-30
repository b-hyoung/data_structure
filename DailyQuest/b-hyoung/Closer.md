# - 클로저란 ?
### 함수가 선언될 시 외부변수(스코프)를 통해 기억 후
### 나중에 해당변수를 통해 재사용하기위한 함수
## 
 
    
    function outer() {
        let count = 0;
        
        return function inner() {
            count++;
            console.log(count);
        };
    }

    const counter1 = outer();
    counter1(); // 1
    counter1(); // 2

    const counter2 = outer(); // 새로운 클로저 생성
    counter2(); // 여기서 다시 1부터 시작!


 ## & 활용처
  - 외부에서 접근하지 못하게 내부 데이터를 숨기고 싶을 때
  - 마치 private 변수처럼 만들 수 있음 
  - 특정 함수를 만들어 내부변수 변경 가능함
  
        function createUser(name) {
            let secret = "my-secret";
            return {
                getName: () => name,
                getSecret: () => secret
                setSecret: (newScreat) => {
                    secreat = newScreat
                }
            };
        }
        const user = createUser("홍길동");

        console.log(user.getSecret()); // "my-secret"
        user.setSecret("비밀변경됨!");
        console.log(user.getSecret()); // "비밀변경됨!"

        ## 질문
        외부변수를 스코프라고 부르나요?
        나중에 해당변수를 통해 재사용하기위한 함수라면 모듈화를 말하는 건가요?
        그리고 활용처에서 나온 말 중 외부에서 내부 변수를 숨기고 싶을 때 쓴다면
        캡슐화 public private이런 것과 같은 건가요? 아니면 용도만 같다거나?

        Q. 외부변수를 스코프라고 부르나요?
            A. : 아닙니다.
                외부변수란 함수내부에서 사용하는 함수밖의 변수를 뜻합니다.
                스코프란 변수를 사용할 수 있는 범위 내를 뜻하는 말입니다.
        Q. 해당변수를 통해 재사용하기위한 것이라면 모듈화를 뜻하는것인가요?
            A. : 모듈화와 비슷한 구조를 가지고있습니다
                 데이터를 재사용함에 있어서는 모듈화와 비슷하지만
                 함수 내부의 특정 데이터를 숨기거나 기억해서 지속적으로 사용할수있게 만든 기능입니다.
        q. 캡슐화와 비슷한 건가요
            A. : 네 맞습니다.
                 캡슐화 같은경우 setName으로 초기화하거나 getName으로 값을 불러와야합니다.
                 그와 비슷하게 closer또한 내부함수를 통해 값을 불러온다는 기능은 같습니다.  
