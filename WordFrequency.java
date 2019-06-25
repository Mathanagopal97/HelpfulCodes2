import java.util.*;
class WordFrequency
{
public static void main(String[]args)
{
List<String> fruits = new ArrayList<String>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Strawberry");
for (int i = 0; i < fruits.size(); i++) {
 //System.out.println (fruits.get(i));
 if ("Apple".equals(fruits.get(i))) {
 fruits.remove(i);
 }
}

for (int i = 0; i < fruits.size(); i++) {
 System.out.println (fruits.get(i));
 }



 

}
}