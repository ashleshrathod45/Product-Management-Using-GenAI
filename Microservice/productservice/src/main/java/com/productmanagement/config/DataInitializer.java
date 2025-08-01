package com.productmanagement.config;

import com.productmanagement.model.User;
import com.productmanagement.model.Product;
import com.productmanagement.repository.UserRepository;
import com.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Create default admin user if not exists
        if (userRepository.findByUsername("admin") == null) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setRole("ADMIN");
            userRepository.save(admin);
            System.out.println("Default admin user created: admin/admin123");
        }

        // Create default manager user if not exists
        if (userRepository.findByUsername("manager") == null) {
            User manager = new User();
            manager.setUsername("manager");
            manager.setPassword(passwordEncoder.encode("manager123"));
            manager.setRole("MANAGER");
            userRepository.save(manager);
            System.out.println("Default manager user created: manager/manager123");
        }

        // Create sample products if none exist
        if (productRepository.count() == 0) {
            Product product1 = new Product("Laptop", 999.99, 10);
            Product product2 = new Product("Mouse", 29.99, 50);
            Product product3 = new Product("Keyboard", 79.99, 25);
            
            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            System.out.println("Sample products created");
        }
    }
}
