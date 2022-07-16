package aabstract;

public abstract class SoftWare {
	public abstract void plan();
	public abstract void develope();
	public abstract void release();
	
	void product() {
		plan();
		develope();
		release();
	}
}
