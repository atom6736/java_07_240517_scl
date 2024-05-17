package com.chihwancompany.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setName("홍길동");
		
//		
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
//		
//		Member member2 = new Member();
//		member2.id = "lion";
//		member2.pw = "12345";
//		member2.Name = "이순신";
//		member2.email = "lee@abc.com";
//		member2.age = 32;
		
		System.out.println("회원1이름:"+member1.getId()); // 홍길동
//		System.out.println("회원2이름:"+member2.getName()); // 이순신
	}

}




//public class MainClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Member member1 = new Member();
//		member1.setId("tiger");
//		member1.setName("홍길동"); // 정해진 변수에 들어가는 거니까 순서는 상관 없음.
//
//		
//		
//		
//		Member member3 = new Member("whitecat","88888","김유신","whitecat@abc.com", 41)
//				// 이것은 게터셋터가 아닌 생성자를 이용하여 만든 방법 
//		// 셋터가 아닌 생성자를 사용하여 필드값이 초기회된 객체 생성
//				
//				
//		
//	}
//
//}
