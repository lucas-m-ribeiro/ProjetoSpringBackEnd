package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import br.gov.sp.fatec.model.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long> {

//	select * from tb_reserva join tb_usuario on tb_usuario.usr_id = reserva_id join tb_carro on tb_carro.car_id = tb_reserva.car_id;
	
//	@Query("SELECT r FROM Reserva r, Carro c, Usuario u WHERE r.car_id = c.id AND r.usr_id = u.id")
//	public List<Object> ReservaJoin();
	
}