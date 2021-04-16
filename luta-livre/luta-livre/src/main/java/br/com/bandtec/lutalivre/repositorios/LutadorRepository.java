package br.com.bandtec.lutalivre.repositorios;

import br.com.bandtec.lutalivre.classe.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LutadorRepository extends JpaRepository<Lutador,Integer> {
}
