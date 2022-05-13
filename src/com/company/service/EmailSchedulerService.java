package com.company.service;

import com.company.dto.CustomerType;
import com.company.dto.ProductDto;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class EmailSchedulerService {

    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);;

    public static void start(ProductDto orderRequest, CustomerType customerType) throws InterruptedException {

        String hash = OrderNumberHashUtil.getHash(orderRequest.getOrder().getDate());
        EmailTemplate emailTemplate = MailTemplateFactory.getType(customerType);

        final Runnable task = () -> emailTemplate.sendEmail("bireysel@gmail.com"+ " Kargo Takip Numaranız: " + hash);

        ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(task, 0, 1, TimeUnit.DAYS);

        while (!scheduledFuture.isDone()) {
            Thread.sleep(5000);
            System.out.println("Sending email... added queue");
        }
    }
}
