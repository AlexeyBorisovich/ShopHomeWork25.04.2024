import java.util.*;

public class MainShop {
    public static void main(String[] args) {
        List<Shop> shops = createShopsList();
        filterShops(shops);
    }

    private static List<Shop> createShopsList() {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Aser", 32, 2, "Windows11", "Black", 17));
        shops.add(new Shop("HP", 16, 1, "Linux", "White", 15));
        shops.add(new Shop("Lenovo", 16, 2, "Windows10", "Red", 14));
        shops.add(new Shop("Dell", 8, 3, "linux", "Black", 17));
        shops.add(new Shop("Asus", 16, 1, "Windows11", "Gold", 14));
        shops.add(new Shop("Gigabyte", 8, 1, "Windows10", "Green", 16));
        shops.add(new Shop("Apple", 32, 1, "MacOS", "Silver", 17));
        return shops;
    }

    private static void filterShops(List<Shop> shops) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> criteria = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - Модель");
        System.out.println("2 - Объём ОЗУ");
        System.out.println("3 - Объем HDD");
        System.out.println("4 - Операционная система");
        System.out.println("5 - Цвет");
        System.out.println("6 - Диагональ");

        System.out.print("Выберите критерий (цифра): ");
        int selectedCriterion = scanner.nextInt();

        switch (selectedCriterion) {
            case 1:
                System.out.print("Введите модель: ");
                String model = scanner.next();
                criteria.put(selectedCriterion, model);
                break;
            case 2:
                System.out.print("Введите минимальный объем ОЗУ: ");
                int minRamCapacity = scanner.nextInt();
                criteria.put(selectedCriterion, minRamCapacity);
                break;
            case 3:
                System.out.print("Введите минимальный объем HDD: ");
                int minHddCapacity = scanner.nextInt();
                criteria.put(selectedCriterion, minHddCapacity);
                break;
            case 4:
                System.out.print("Введите операционную систему: ");
                String operatingSystem = scanner.next();
                criteria.put(selectedCriterion, operatingSystem);
                break;
            case 5:
                System.out.print("Введите цвет: ");
                String color = scanner.next();
                criteria.put(selectedCriterion, color);
                break;
            case 6:
                System.out.print("Введите минимальную диагональ: ");
                int minDiagonal = scanner.nextInt();
                criteria.put(selectedCriterion, minDiagonal);
                break;
            default:
                System.out.println("Неверный ввод.");
                return;
        }

        // Фильтрация магазинов и вывод результатов
        shops.stream()
                .filter(shop -> {
                    switch (selectedCriterion) {
                        case 1:
                            return shop.getModel().equalsIgnoreCase((String) criteria.get(selectedCriterion));
                        case 2:
                            return shop.getRamcapacity() >= (int) criteria.get(selectedCriterion);
                        case 3:
                            return shop.getHddcapacity() >= (int) criteria.get(selectedCriterion);
                        case 4:
                            return shop.getOperatingsystem().equalsIgnoreCase((String) criteria.get(selectedCriterion));
                        case 5:
                            return shop.getColor().equalsIgnoreCase((String) criteria.get(selectedCriterion));
                        case 6:
                            return shop.getDiagonal() >= (int) criteria.get(selectedCriterion);
                        default:
                            return false;
                    }
                })
                .forEach(System.out::println);
    }
}