package kr.ac.hansung.cse.exception;

// RuntimeException을 상속
public class DuplicateCategoryException extends RuntimeException {
    public DuplicateCategoryException(String name) {
        // 이제 부모 클래스(RuntimeException)의 생성자를 정상적으로 호출할 수 있습니다.
        super("이미 존재하는 카테고리입니다: " + name);
    }
}
