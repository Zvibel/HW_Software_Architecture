package HW.HW4.HW.Interfaces;

import HW.HW4.HW.Models.Carrier;

/**
 * Интерфейс взаимодействия с базой перевозчиков
 */
public interface ICarrierRepo {
    /**
     * Получить модель перевозчика из базы по ID
     *
     * @param id идентификатор перевозчика в базе
     * @return
     */
    Carrier read(int id);
}
