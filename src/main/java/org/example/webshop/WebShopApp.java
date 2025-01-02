package org.example.webshop;

public class WebShopApp
{
    public static void main(String[] args)
    {
        Product samsung = new Product();
        Product iphone = new Product();
        Product huawei = new Product();

        samsung.setName("Samsung Galaxy S21");
        samsung.setPrice(999.99);
        samsung.setStock(100);

        iphone.setName("iPhone 12 Pro");
        iphone.setPrice(1099.99);
        iphone.setStock(50);

        huawei.setName("Huawei P40 Pro");
        huawei.setPrice(899.99);
        huawei.setStock(75);



        System.out.println(samsung.toString());
        System.out.println(iphone.toString());
        System.out.println(huawei.toString());

        samsung.purchaseItems(10);
        iphone.purchaseItems(5);
        huawei.purchaseItems(15);

        System.out.println(samsung.toString());
        System.out.println(iphone.toString());
        System.out.println(huawei.toString());

        samsung.setPrice(-1);
        iphone.setStock(-30);
        samsung.purchaseItems(100);
    }
}
