package com.suresh.hashing;

public class Permutation {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();

		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);

	}

	private void permute(String str, int l, int r) {
		if(l == r){
			System.out.println(str);
		}else{
			for (int i = l; i <= r; i++) {
				//str = swap(str, i, l);
			}
		}
	}
	
	public String swap(){
		return null;
	}

}
