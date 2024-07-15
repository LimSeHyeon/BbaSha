# BbaSha

## 설계도
저희는 학습과 추상화를 통한 확장성을 고려하고자 Spring MVC를 참고하여 개발하였습니다.
Spring MVC 설계도는 다음과 같습니다.
![image](https://github.com/user-attachments/assets/9001c724-e1f5-482c-bbb0-4afbb48d4589)

저희가 설게한 MVC 설계도는 다음과 같습니다. 
![우리 설계도 drawio](https://github.com/user-attachments/assets/6d0612bd-0527-4182-85e9-e33f42251e6d)

## 한계점
- 동적인 View를 랜더링하지 못하는 설계 이슈
  - JSP와 같은 동적인 View 페이지를 만들어야 하는데 고려하지 못함
- Controller를 통일하지 못해 Dispatcher에서 Controller Mapping과 호출을 모두 담당하게 됨.
  - Dispatcher에 책임이 많이 부여됨.
