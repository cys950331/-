Github 주소
https://github.com/cys950331/-



1. 안드로이드 스튜디오 SDK (Tools -> SDK Manager로 확인)
   - SDK 플랫폼 : Android 10.0(Q)
   - Android SDK Build-Tools : 29.0.2
   - Android Emulator
   - Android SDK Platform-Tools
   - Android SDK Tools
   - Intel x86 Emulator Accelerator (HXAM Installer)
   
2. JDK-10.0.2 
  java version "10.0.2" 2018-07-17
  
  Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
  
  Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.2+13, mixed mode)

3. 안드로이드 스튜디오 실행 환경
   64비트 MAC OS 환경
   
   
4.코드 설명
1) 첫번째 페이지 (Relative layout 사용)
  입력받은 id와 비밀번호를 배열에서 확인하고 배열에 존재하는 상태에서 로그인 버튼을 누르면 세번째 페이지로 이동 할 수 있게끔 구현.
  회원가입 버튼을 누르면 회원가입을 할 수 있는 두번째페이지로 이동할 수 있도록 구현.
  
2) 두번째 페이지(Linear layout 사용)
  id,비밀번호,이름,주소,전화번호 를 입력받고 회원가입약관에 동의를 하고 저장을 누르면 id와 비밀번호를 각 배열에 저장하도록 구현.
  돌아가기 버튼을 누르면 다시 뒤로 돌아갈 수 있도록 구현.
  
3) 세번째 페이지(Table layout 사용)
  회원가입을 마치고 로그인화면에서 로그인에 성공하면 나타나는 창으로 간단하게 계산을 할 수 있는 계산기 구현
  계산결과를 나타내는 글씨를 붉은색으로 하여 조금 더 시인성 좋게 구현.
  돌아가기 버튼을 누르면 로그인 페이지로 갈 수 있도록 구현.

4) 계속되는 문제점
  회원가입 페이지에서 생성된 배열의 문제인지 등록되지않은 id와 비밀번호도 세번째화면으로 넘어가지는 오류가 발생.
  코드를 몇번이나 수정해봤지만 같은 문제가 발생.
  작성한 코드를 윈도우환경에서 돌리려고 했으나 돌아가지않는 문제 발생.
