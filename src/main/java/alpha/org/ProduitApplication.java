package alpha.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner{
	
//	@Autowired
//	private UserRepository userRepository;
//	@Autowired
//	private RoleRepository roleRepository;
//	@Autowired
//	private ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

////		produitRepository.save(new Produit("Livre", 50, 20));
////		produitRepository.save(new Produit("Stylo", 29, 3));
////		produitRepository.save(new Produit("Crayon", 80, 1));
//		
//		Role roleUser = new Role("ROLE_USER");
//		Role roleAdmin = new Role("ROLE_ADMIN");
//		
//		roleRepository.save(roleUser);
//		roleRepository.save(roleAdmin);
//		
//		User user1 = new User("user", "password", true);
//		User admin = new User("admin", "adm123", true);
//		
//		user1.setRoles(Arrays.asList(roleUser));
//		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
//		
//		userRepository.save(user1);
//		userRepository.save(admin);
	}
}
