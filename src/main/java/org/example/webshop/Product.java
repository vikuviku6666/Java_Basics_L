package org.example.webshop;

public class Product
{
    public String name;
    public double price;
    private int stock;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {

        return price;
    }

    public void setPrice(double price)
    {
        try
        {
            if(price < 0)
            {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Line 37: " + e.getMessage());
        }
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        try
        {
            if(stock < 0)
            {
                throw new IllegalArgumentException("Stock cannot be negative");
            }
            this.stock = stock;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Line 58: " + e.getMessage());
        }

    }

    public void purchaseItems(int quantity)
    {
        try
        {
            if (quantity < 0)
            {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            if (quantity > stock)
            {
                throw new IllegalArgumentException("Not enough stock");
            }
            stock -= quantity;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Line 79: " + e.getMessage());
        }
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + stock +
                '}';
    }
}
