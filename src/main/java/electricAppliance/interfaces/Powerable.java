package electricAppliance.interfaces;

/**
 * Взаимодействи электроприбора с сетью: проверка подключения к розетке и само подключение к электросети
 */

public interface Powerable {
    /**
     * Определяет состояние подключения электроприбора к сети
     */
    boolean isPowered();

    /**
     * Подключение/отключение электроприбора
     * @param powered указывает является ли электроприбор подключенным к электросети или нет
     */
    void setPowered(boolean powered);
}