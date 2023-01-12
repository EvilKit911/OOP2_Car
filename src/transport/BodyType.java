package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNEVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн"),
        NODATA("Нет Данных")// добавил на случай не ввода данных
        ;

        private String typeBody;

        BodyType(String typeBody) {

                this.typeBody = typeBody;
        }

        @Override
        public String toString() {
                return typeBody ;
        }
}
