package aabstract;

public class Pound extends Weight{

	@Override
	public int getGram(int cnt) {
		return cnt*453;
	}

}
