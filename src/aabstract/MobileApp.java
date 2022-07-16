package aabstract;

public class MobileApp extends SoftWare{

	@Override
	public void plan() {
		System.out.println("모바일 계획");
	}

	@Override
	public void develope() {
		System.out.println("모바일 앱 개발");
	}

	@Override
	public void release() {
		System.out.println("출시");
	}

}
