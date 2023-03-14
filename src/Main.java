public class Main {
    public static void main(String[] args) {

        System.out.println("");

    }


    //elimizde bir nece eded deyisenimiz var  ve massivdir biz bu deyisenleri ele etmeliyikki
    //sonraki deyisen evvelki deyisenin ustune gelib bir deyisen qaytarib integerin icine doldursun
    // bize bir sum deyiseni lazimdirki sonraki ile evvelkinin cemini ust uste gelenden sonra bize
    // 2-sinin cemini qaytarsin burada metodun tipi oldugu ucun return deyer qaytarmalidir
    // qaytaracagi return deyeri ise deyisenin icine yigib bize netice vermelidir

    public int[] runningSum(int[] nums) {
        int sum = 0;//bos sum deyeri
        int[] res = new int[nums.length];//arrayin uzunlugunu bir deyisene atmaq
        for (int i = 0; i < nums.length; i++) {//0-dan baslayib arrayin uzunlugunu indexlere gore yoxlamaq
            sum = sum + nums[i];//bos sum deyerine arrayin indexine yazmaq
            res[i] = sum;//arrayin uzunlugundaki deyisenleri sum deyerine ardicil yigmaq
        }
        return res;
    }
}


