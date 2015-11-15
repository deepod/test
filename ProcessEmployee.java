package workspace2;

public class ProcessEmployee {
    public static void main(String[] args){
        Employee emp1 = new Employee("Ada", 2, "Programmer", 2333234);
        System.out.println(emp1);

        Employee employeeArray [] = {new Employee("Ada",2,"Programmer", 6093939), new Employee("Bob", 39,"Plumber",2134432)};

        for (int k = 1; k<employeeArray.length; k++ ){
            System.out.println(employeeArray[k]);
        }

        int[] ia = new int[10];

        ia[0] = 23;
        ia[1] = 43;
        ia[2] = 37;
        ia[3] = 42;
        ia[4] = 17;

		/*
		for (int i=0; i<ia.length; i++){
			System.out.println(ia[i]);
		}*/

        int i = 0;
        while (ia[i] != 0){
            System.out.println(ia[i]);
            i++;
        }

        Employee[] employeeArray2 = new Employee[10];
        employeeArray2[0] = new Employee("Ada",2,"Programmer", 6093939);
        employeeArray2[1] = new Employee("Bob", 39,"Plumber",2134432);

        for (int j=0; j<employeeArray2.length; j++){
            System.out.println(employeeArray2[j]);
        }

        int l = 0;
        while (employeeArray2[l] != null){
            System.out.println(employeeArray2[l]);
            l++;
        }

    }
}
