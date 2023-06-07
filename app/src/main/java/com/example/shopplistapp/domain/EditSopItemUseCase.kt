package com.example.shopplistapp.domain

class EditSopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem){
            shopListRepository.editShopItem(shopItem)
    }
}