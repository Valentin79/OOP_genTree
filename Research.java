import java.util.ArrayList;
import java.util.List;

public class Research{
    List<Relation> allRelation = new ArrayList<>();

    public List<Person> findRelation(String name, RelationType type){
        System.out.println(name+ ": "+ type);
        
        List<Person> result = new ArrayList<>();
        for(Relation relation : allRelation){
            if(relation.member1.name.equals(name) && relation.relationType == type){
                result.add(relation.member2);
            }
        }
        return result;
    }
    public void findAllRelation(String name){ // ищем все связи конкретной персоны
        System.out.println(name);
        //List<Person> result = new ArrayList<>();
        for(Relation relation : allRelation){
            if(relation.member1.name.equals(name)){
                // System.out.println(relation.relationType);
                // System.out.println(relation.member2);
                // result.add(relation.member2);
                findRelation2(relation.member1.name, relation.member2.name);
                System.out.println(relation.member2);
            }
        }
        // return result;
    }
    public void findRelation2(String name, String name2){ // ищем связь между двумя персонами
        for(Relation relation : allRelation){
            if(relation.member1.name.equals(name) && relation.member2.name.equals(name2)){
                // var result = relation.relationType;
                // System.out.println(result);
                String result = relation.relationType.toString();
                System.out.println(result);
            }
        }
    }
}