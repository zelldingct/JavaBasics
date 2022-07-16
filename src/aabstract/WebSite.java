package aabstract;

public class WebSite extends SoftWare {

	@Override
	public void plan() {
		System.out.println("웹 계획");
	}

	@Override
	public void develope() {
		System.out.println("웹 개발");
	}

	@Override
	public void release() {
		System.out.println("웹 출하");
	}
	

}
