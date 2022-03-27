import by.gsu.lab.Trip;

public class Runner {
    public static void main(String[] args) {

        Trip.bid = 3500;
        //1
        Trip[] arr = new Trip[10];
        arr[0] = new Trip("Tony Shumsky", 1625, 5);
        arr[1] = new Trip("Evgeny Plyago", 150, 10);
        arr[2] = null;
        arr[3] = new Trip("Vladislav Parhutich", 2500, 20);
        arr[4] = new Trip("Evgeny Plyago", 270, 13);
        arr[5] = new Trip("Vladislav Gromyko", 3434, 23);
        arr[6] = new Trip("Oleg Semenchik", 471, 15);
        arr[7] = new Trip("Tony Shumsky", 1200, 3);
        arr[8] = new Trip("Evgeny Plyago", 70, 5);
        arr[9] = new Trip();

        //2
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                arr[i].show();
                System.out.println();
            }
        }

        //3
        arr[arr.length - 1].setFare(100);

        //4
        for(int i = arr.length - 1; i >= 0; i--){
            boolean check = false;
            for(int j = i; j < arr.length ; j++){
                if(arr[i] != null && arr[j] != null){
                    if(arr[i].getAccount().equals(arr[j].getAccount()) && i != j){
                        check = true;
                    }
                    if(j == arr.length - 1 && !check){
                        arr[i].setBuisnesDays(arr[i].getBuisnesDays() + 1);
                    }
                }

            }
        }

        //5
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        /*6. Вывести суммарную продолжительность двух первых командировок определенного сотрудника.
            Пример: Продолжительность = 9 5.
            я увидел небольшое расхождение в задании поэтому сделал два метода
                sum1. Суммарная продолжительность представляется как  14( = 9 + 5)
                sum2. В соответствии с примером
        */
        System.out.println("Суммарная продолжительность командировок " + arr[4].getAccount() + " равна " + sum1(arr[4].getAccount(), arr));
        System.out.println("Суммарная продолжительность командировок " + arr[4].getAccount() + " равна " + sum2(arr[4].getAccount(), arr));

        //7
        System.out.println("Среднее общих расходов = " + avgExpenses(arr));
    }

    public static String sum1(String name, Trip[] arr){
        int counter = 0;
        int result = 0;
        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i] != null){
                if(name.equals(arr[i].getAccount())){
                    counter++;
                    result += arr[i].getBuisnesDays();
                }
                if(counter == 2){
                    return Integer.toString(result);
                }
            }
        }
        return Integer.toString(result);
    }
    public static String sum2(String name, Trip[] arr){
        int counter = 0;
        String result = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != null){
                if(name.equals(arr[i].getAccount())){
                    counter++;
                    result += arr[i].getBuisnesDays() + " ";
                }
                if(counter == 2){
                    return result;
                }
            }
        }
        return result;
    }

    public static double avgExpenses(Trip[] arr){
        double counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                counter += arr[i].getTotal();
            }
        }
        return counter / arr.length;
    }
}
