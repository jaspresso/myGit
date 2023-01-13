package test;

interface Member {
	void number();
	void name();
	void email();
	
}

public class MemberAnony {
	
	public static void main(String[] args) {
		Member m = new Member() {

			@Override
			public void number() {
				String num = "고객번호";
				class NumberInner{
					int num = 1;
					void numberP() {
						num++;
					}
				}
				NumberInner nu = new NumberInner();
				nu.numberP();
				System.out.println(num + " : " + nu.num);
			}

			@Override
			public void name() {
				String name = "이름";
				class NameInner{
					String name;
					void nameP() {
						name = "김길동";
					}
				}
				NameInner na = new NameInner();
				na.nameP();
				System.out.println(name + " : " + na.name);
				
			}

			@Override
			public void email() {
				String email = "이메일";
				class EmailInner{
					String email;
					void emailP() {
						email = "kim@gmail.com";
					}
				}
				EmailInner em = new EmailInner();
				em.emailP();
				System.out.println(email + " : " + em.email);
				
			}
		};
		
		System.out.println("==============================");
		m.number();
		m.name();
		m.email();
		System.out.println("==============================");
	}		
}