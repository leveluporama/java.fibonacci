class run{
public static void main(String args[]){
	//Проверка на наличие параметров 
	if (args.length >= 1){
			//Проверка число ли параметр
			if (args[0].matches("[-+]?\\d+")){
				int n = Integer.parseInt(args[0]);
				fibonacci f = new fibonacci();
				f.makeSeries(n);
			}	
				else {
				System.out.println("Параметр должен быть целым числом");
			}
		} 
		else{
			System.out.println("Нет параметров");
		}

		
	}	
}
