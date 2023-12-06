package com.optasia.microservicesexercise.other;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

public class IdsListContributor implements InfoContributor{

    private IdsList idsList = new IdsList();

    public IdsListContributor() {
    }

    public void contribute(Info.Builder builder) {
        builder.withDetail("Ids", this.idsList.getRandomQuote());
    }
}



