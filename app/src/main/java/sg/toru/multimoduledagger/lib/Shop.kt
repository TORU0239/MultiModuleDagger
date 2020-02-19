package sg.toru.multimoduledagger.lib

import javax.inject.Inject

class Shop @Inject constructor(
    private val hamburger: Hamburger,
    private val hotdog:HotDog
) {

    fun printMenu() {
        hamburger.ingredient()
        hotdog.ingredient()
    }
}