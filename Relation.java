public class Relation {
    Person member1;
    Person member2;
    RelationType relationType;

    public Relation(Person member1, Person member2, RelationType relationType){
        this.member1 = member1;
        this.member2 = member2;
        this.relationType = relationType;
    }

    // @Override
    // public String toString(){
    //     return "Relation{"+
    //     "member1 = "+ member1.name +
    //     " member2 = "+ member2.name +
    //     " relationType = "+ relationType +
    //     "}";
    // }

}
