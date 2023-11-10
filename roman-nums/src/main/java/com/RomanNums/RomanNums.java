package com.RomanNums;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@SpringBootApplication
public class RomanNums {
 
        @GetMapping("/api/romano/{id}")
        public String home(@PathVariable String id) {
                return this.integerToRoman(Integer.parseInt(id));
        }

        private String integerToRoman(int num) {
                String[] M = {"", "M", "MM", "MMM"};
                String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
                String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
                String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
                return M[num / 1000] +
                       C[(num % 1000) / 100] +
                       X[(num % 100) / 10] +
                       I[num % 10];
        }
 
        public static void main(String[] args) {
                SpringApplication.run(RomanNums.class, args);
        }
 
}