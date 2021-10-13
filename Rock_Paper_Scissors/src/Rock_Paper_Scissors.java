
//Чисто от Lato
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String r = "Rock";
        String p = "Paper";
        String s = "Scissors";
        String vr = " vs Rock";
        String vp = " vs Paper";
        String vs = " vs Scissors";
        String[] strArray = {r, p, s};
        int RandomElement = (int) ((Math.random() * (strArray.length - 0)) + 0);
        System.out.println(" ");
        System.out.print(strArray[RandomElement]);

        String[] HAY = {vr, vp, vs};
        int Random = (int) ((Math.random() * (strArray.length - 0)) + 0);
        System.out.print(HAY[Random]);
        // ничья камень и камень
        if (strArray[RandomElement].contains(r) && HAY[Random].contains(vr) || strArray[RandomElement].contains(r) && HAY[Random].contains(vr))
        {
            System.out.println("\n ");
            System.out.println("Result : Draw ");
        }
        // ничья бумага и бумага
        if (strArray[RandomElement].contains(p) && HAY[Random].contains(vp) || strArray[RandomElement].contains(p) && HAY[Random].contains(vp))
        {
            System.out.println("\n ");
            System.out.println("Result : Draw ");
        }
        // ничья ножницы и ножницы
        if (strArray[RandomElement].contains(s) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vs))
        {
            System.out.println("\n ");
            System.out.println("Result : Draw ");
        }
        // победа бумаги , камень и бумага
        if (strArray[RandomElement].contains(r) && HAY[Random].contains(vp) || strArray[RandomElement].contains(p) && HAY[Random].contains(vr))
        {
            System.out.println("\n ");
            System.out.println("Result : Paper win");
        }
        // победа камня , камень и ножницы
        if (strArray[RandomElement].contains(r) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vr))
        {
            System.out.println("\n ");
            System.out.println("Result : Rock win");
        }
        // победа ножниц , бумага и ножницы
        if (strArray[RandomElement].contains(p) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vp))
        {
            System.out.println("\n ");
            System.out.println("Result : Scissors win");
        }
    }
}