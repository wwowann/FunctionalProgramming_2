import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<LandPlot> landPlots = new ArrayList<>();
        System.out.println("Введите длину участка");
        long width = Long.parseLong(scan.nextLine());
        System.out.println("Введите ширину участка");
        long lendthPlot = Long.parseLong(scan.nextLine());
        System.out.println("Введите стоимость участка за 1 кв.метр");
        long cost = Long.parseLong(scan.nextLine());
        System.out.println("Введите адекватную стоимость 1 кв.метра земли");
        long costPlot = Long.parseLong(scan.nextLine());

        landPlots.add(new LandPlot(width, lendthPlot, cost));
        landPlots.add(new LandPlot(10, 15, 11000));
        landPlots.add(new LandPlot(15, 15, 12600));
        landPlots.add(new LandPlot(13, 25, 15600));
        landPlots.add(new LandPlot(30, 10, 10700));
        landPlots.add(new LandPlot(11, 14, 20300));
        System.out.println("Список земельных участков с адекватной ценой за 1 кв.метр");
        landPlots.stream().filter(value -> value.getCost() < costPlot).forEach(System.out::println);

    }
}
