public class CardTask {
    private String cardNumber;   // Номер карты
    private String expirationDate; // Срок годности
    private String cvv;           // CVV код
    private String pinCode;       // Пин-код

    // Конструктор для инициализации
    public CardTask(String cardNumber, String expirationDate, String cvv, String pinCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    // Метод для печати номера карты с маской
    public void printMaskedCardNumber() {
        String maskedNumber = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println(maskedNumber);
    }

    // Метод для печати полного номера карты при правильном пин-коде
    public void printCardNumberWithPin(String inputPin) {
        if (this.pinCode.equals(inputPin)) {
            System.out.println(this.cardNumber);  // Печать полного номера карты
        } else {
            System.out.println("Неверный PIN-код.");
        }
    }

    public static class MyProgram {
        public static void main(String[] args) {
            // Создаем объект карты с данными
            CardTask myCard = new CardTask("1234567812345678", "12/25", "123", "0000");

            // Выводим номер карты с маской
            System.out.print("Маскированный номер карты: ");
            myCard.printMaskedCardNumber();

            // Пример с правильным PIN
            System.out.print("Номер карты при правильном PIN: ");
            myCard.printCardNumberWithPin("0000");

            // Пример с неправильным PIN
            System.out.print("Номер карты при неправильном PIN: ");
            myCard.printCardNumberWithPin("1111");
        }
    }
}