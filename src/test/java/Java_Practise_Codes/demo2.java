package Java_Practise_Codes;

import java.util.*;
import java.util.stream.Collectors;

class product{
    int id; String product;float price;

    public product(int id, String product, float price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }
}

public class demo2 {
    public static void main(String[] args) {

        List<product> productsList= new ArrayList<product>();

        productsList.add(new product(1,"HP Laptop",25000f));
        productsList.add(new product(2,"Dell Laptop",30000f));
        productsList.add(new product(3,"Lenevo Laptop",28000f));
        productsList.add(new product(4,"Sony Laptop",28000f));
        productsList.add(new product(5,"Apple Laptop",90000f));

        productsList.forEach((n)-> System.out.println(n.product)); //printing the list


        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
        List sortedList=list.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

        Set<Float> priceList=productsList.stream().
                            filter(product -> product.price>3000).map(product -> product.price).
                            collect(Collectors.toSet());

        System.out.println("Converted to Set:-"+priceList);

        Map<Integer , String> productMap=productsList.stream().
                                        collect(Collectors.toMap(p->p.id,p->p.product));
        System.out.println("Converted to Map:-"+productMap);


    }


}
