package sample;

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new Function());
		System.out.println("aaa");
		t.start(); /*start()はFunctionのrun();を実行する。最後に。*/
		System.out.println("bbb");
		System.out.println("ccc");
		System.out.println("ddd");

//		結果は
//		aaa
//		bbb
//		ccc
//		ddd
//		hello_test

	}
}
class Function implements Runnable{

	@Override
	public void run() {
		System.out.println("hello_test");
	}

}















