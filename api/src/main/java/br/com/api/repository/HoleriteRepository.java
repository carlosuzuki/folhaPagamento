package br.com.api.repository;import br.com.api.models.Holerite;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;@Repositorypublic interface HoleriteRepository extends JpaRepository<Holerite, Long > {}