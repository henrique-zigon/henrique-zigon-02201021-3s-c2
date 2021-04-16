package br.com.bandtec.lutalivre.repositorios;

import br.com.bandtec.lutalivre.classe.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador,Integer> {

List<Lutador> findByVivoTrue();
List<Lutador> findByVivoFalse();
}
