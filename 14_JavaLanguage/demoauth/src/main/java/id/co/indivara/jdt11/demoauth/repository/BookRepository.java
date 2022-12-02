package id.co.indivara.jdt11.demoauth.repository;
import  id.co.indivara.jdt11.demoauth.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {


}
