package Star_Pattern;

public class pattern1 {

	public static void main(String[] args) {

		int star = 1;

		for (int i = 1; i <= 5; i++) {  //No of columns= i<=no of values i.e.5

			for (int j = 1; j <= star; j++) { //No of rows is j

				System.out.print("*");
			}

			System.out.println();
			star++;

		}

	}

}
