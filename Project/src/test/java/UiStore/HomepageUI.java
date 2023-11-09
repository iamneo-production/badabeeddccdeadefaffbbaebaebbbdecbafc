package UiStore;

import org.openqa.selenium.By;

class HomepageUI {
    static get searchBar() {
        return By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/button[2]/i");
    }

    static japanBrand () {
        return By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[1]/div[2]/v-accordion[3]/v-pane[1]/v-pane-content[1]/div[1]/ul[1]/li[8]/md-checkbox[1]/div[1]");
    }

    static get ProductName() {
        return By.xpath("//h1[contains(text(),'Peppa Pig: Peppa\u2019s Adventures - Peppa\u2019s Family Mot')]");
    }

    static get AllowButton() {
        return By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    }
}