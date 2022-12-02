package id.co.indivara.jdt11.jpamysqlpedas;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class User{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;

}