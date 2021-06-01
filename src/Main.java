 import java.util.*;
        import java.util.function.*;
        public class Main {
            private String species;
            private boolean canHop;
            private boolean canSwim;
            public Main(String speciesName, boolean hopper, boolean swimmer) {
                species = speciesName;
                canHop = hopper;
                canSwim = swimmer;
            }
            public boolean canHop() { return canHop; }
            public boolean canSwim() { return canSwim; }
            public String toString() { return species;
            }
              public static void main(String[] args) {
                    List<Main> animals = new ArrayList<Main>();
                    animals.add(new Main("fish", false, true));
                                    print(animals, a -> a.canSwim());
                  }
  private static void print(List<Main> animals, Predicate<Main> checker) {
                   for (Main animal : animals) {
                         if (checker.test(animal))
                                 System.out.print(animal + " ");
                         }
                     System.out.println();
                  }
 }
//fish

 //вместо CheckTrait checker из другого репо 25 строка у нас в 21 строке Predicate<Main> checker

 //В нашем предыдущем примере мы создали интерфейс с одним методом:
 //
 //boolean test(Animal a);
 //Лямбды работают с интерфейсами, которые имеют только один метод.
 // Это так называемые функциональные интерфейсы - интерфейсы, которые можно использовать с функциональным программированием.
 // (На самом деле это сложнее, чем это, но для экзамена ОСА это определение подходит.)
 //Вы можете себе представить, что нам нужно было бы создать множество таких интерфейсов,
 // чтобы использовать лямбды. Мы хотим проверить Animals и Strings и Plants и все остальное, с чем мы сталкиваемся.
 //К счастью, Java признает, что это распространенная проблема, и предоставляет нам такой интерфейс.
 // Это в упаковке, java.util.functionи суть этого заключается в следующем:
 //
 //public interface Predicate<T> {
 //  boolean test(T t);
 //}
 //Это очень похоже на наш метод. Разница лишь в том, что он использует этот тип Tвместо Animal.
 // Это синтаксис для дженериков. Это как когда мы создали ArrayListи должны указать любой тип, который входит в него
 //.Это означает, что нам больше не нужен наш собственный интерфейс,
 // и мы можем поместить все, что связано с нашим поиском, в один класс: