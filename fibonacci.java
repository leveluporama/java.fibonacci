сlass fibonacci{

	public void makeSeries(int n){

				int count = 0;
				do {
					count++;
					System.out.println(f(count));
				} while(count < n);
	}

	public int f(int n){
		if (n<=2){
						return 1;	
					}
					else{

						return f(n-1) + f(n-2);
					}
	}
}
