package streams;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str="aabbccddeeffg";

      Optional<Character> firstNonRepeated= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();

      if(firstNonRepeated.isPresent()){
          System.out.println("First Non repeated character -> "+firstNonRepeated.get());
      }else{
          System.out.println("No non-repeated character found.");
      }

    }
}
