/*
    함수를 불러와 실행한값을 임시로 변수에 넣어주고 재사용할 수 있는 방법
 
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
    counter2(); // 1 👈 여기서 다시 1부터 시작!

*/
