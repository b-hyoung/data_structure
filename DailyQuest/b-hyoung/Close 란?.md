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