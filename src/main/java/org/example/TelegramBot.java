package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class TelegramBot extends TelegramLongPollingBot{


    //Метод для хранения username Telegram бота.
    @Override
    public String getBotUsername() {
        return "RMJSimpleBot_bot";
    }

    //Метод для хранения токена бота.
    @Override
    public String getBotToken() {
        return "7752943711:AAHtVboJ2SlSNONSMUKMS_D6-Gd0a_N9MXo";
    }

    //Метод для взаимодействия с ботом.
    @Override
    public void onUpdateReceived(Update update) {
        String chatId = update.getMessage().getChatId().toString(); //получения идентификатора чата с пользователя.
        String text = update.getMessage().getText(); //Получение текста сообщения.

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId); //Устанавливаем ID чата.
        sendMessage.setText(text); //устанавливаем текст сообщения.

        try {
            this.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}