package com.ellkhamitech.foodswipe.data.stub

import com.ellkhamitech.foodswipe.data.model.Product
import com.ellkhamitech.foodswipe.data.model.SalePrice
import com.ellkhamitech.foodswipe.domain.model.FoodCategory


object FoodCategoriesAfterMappingStub {

    private val salePrice = SalePrice("10", "EGP")

    private val product1 = Product(
        categoryId = "2",
        description = "desc",
        id = "1",
        name = "Orange",
        salePrice = salePrice,
        url = "http://mobcategories.s3-website-eu-west-1.amazonaws.com/image.jpg"
    )
    private val product2 = Product(
        "1",
        "dec",
        "2",
        "Apple",
        salePrice,
        "http://mobcategories.s3-website-eu-west-1.amazonaws.com/image2.jpg"
    )

    private val productsList = listOf(product1, product2)

    private val foodCategory = FoodCategory("name", productsList)

    val foodCategories = listOf(foodCategory)

}