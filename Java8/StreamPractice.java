package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {


        List<Employee> list=new ArrayList<>();

        list.add(new Employee("susmith",39,200));
        list.add(new Employee("ravali",31,300));
        list.add(new Employee("ishan",4,400));
        list.add(new Employee("arnisha",1,400));

        list.stream().filter(employee -> employee.getAge() == 39).forEach(employee -> System.out.println(employee.getName()));

    Map<Integer,Employee> map=new HashMap<>();

    map.put(1,new Employee("susmith",39,200));
    map.put(2,new Employee("susmith",39,200));
    map.put(3,new Employee("susmith",39,200));

   map.entrySet().stream().filter(e->"susmith".equals(e.getValue()));
    }
}
