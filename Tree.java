import java.util.List;

public class Tree {
    public static void main(String[] args) {
        Person human1 = new Person("Вася", "Чернов", 25, SexType.MAN);
        Person human2 = new Person("Александр", "Чернов", 60, SexType.MAN);
        Person human3 = new Person("Любовь", "Чернова", 59, SexType.WOMAN);
        Person human4 = new Person("Маша", "Чернова", 2, SexType.WOMAN);
        Person human5 = new Person("Лена", "Чернова", 25, SexType.WOMAN);
        Person human6 = new Person("Катя", "Чернова", 2, SexType.WOMAN);

        Relation relation1 = new Relation(human1, human4, RelationType.PARENT);
        Relation relation2 = new Relation(human5, human4, RelationType.PARENT);
        Relation relation3 = new Relation(human2, human1, RelationType.PARENT);
        Relation relation4 = new Relation(human3, human1, RelationType.PARENT);
        Relation relation11 = new Relation(human1, human6, RelationType.PARENT);
        Relation relation12 = new Relation(human5, human6, RelationType.PARENT);
        Relation relation5 = new Relation(human1, human2, RelationType.CHILD);
        Relation relation6 = new Relation(human1, human3, RelationType.CHILD);
        Relation relation7 = new Relation(human4, human1, RelationType.CHILD);
        Relation relation8 = new Relation(human4, human5, RelationType.CHILD);
        Relation relation13 = new Relation(human6, human1, RelationType.CHILD);
        Relation relation14 = new Relation(human6, human5, RelationType.CHILD);
        Relation relation9 = new Relation(human1, human5, RelationType.SPOUSES);
        Relation relation10 = new Relation(human5, human1, RelationType.SPOUSES);
        Relation relation15 = new Relation(human4, human6, RelationType.BROTHER_OR_SISTER);
        Relation relation16 = new Relation(human6, human4, RelationType.BROTHER_OR_SISTER);
        Relation relation17 = new Relation(human2, human3, RelationType.SPOUSES);
        Relation relation18 = new Relation(human3, human2, RelationType.SPOUSES);
        Relation relation19 = new Relation(human2, human4, RelationType.GRANDFATER);
        Relation relation20 = new Relation(human3, human4, RelationType.GRANDMOTHER);
        Relation relation21 = new Relation(human2, human6, RelationType.GRANDFATER);
        Relation relation22 = new Relation(human3, human6, RelationType.GRANDMOTHER);
        Relation relation23 = new Relation(human4, human2, RelationType.GRANDDAUGHTER);
        Relation relation24 = new Relation(human4, human3, RelationType.GRANDDAUGHTER);
        Relation relation25 = new Relation(human6, human2, RelationType.GRANDDAUGHTER);
        Relation relation26 = new Relation(human6, human3, RelationType.GRANDDAUGHTER);

        Research allRelation = new Research();
        allRelation.allRelation.addAll(List.of(relation1, relation2, relation3, relation4,
                                            relation5, relation6, relation7, relation8, 
                                            relation9, relation10, relation11, relation12,
                                            relation13, relation14, relation15, relation16,
                                            relation17, relation18, relation19, relation20,
                                            relation21, relation22, relation23, relation24,
                                            relation25, relation26));
        // System.out.println(allRelation.findRelation("Вася", RelationType.CHILD)); 
        // System.out.println(); 
        // System.out.println(allRelation.findRelation("Вася", RelationType.PARENT)); 
        // System.out.println(); 
        //System.out.println(allRelation.findRelation("Вася", RelationType.SPOUSES));
        // System.out.println(); 
        //System.out.println(allRelation.findRelation("Вася", RelationType.BROTHER_OR_SISTER));
        allRelation.findAllRelation("Маша");
        // allRelation.findRelation2("Вася", "Лена");
        
                                        
    }
}