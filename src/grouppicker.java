import java.util.*;

public class grouppicker {
    List<String> names;

    public grouppicker(List<String> names){
        this.names = names;
    }

    public ArrayList<String> createGroup(String targetName) throws Exception {
        ArrayList<ArrayList<String>> groups = new ArrayList();
        ArrayList<String> tmpGroup = new ArrayList();
        for (String name: this.names) {
            tmpGroup.add(name);
            if (tmpGroup.size() == 3) {
                groups.add(tmpGroup);
                tmpGroup = new ArrayList<String>();
            }
        }

        for (ArrayList<String> group : groups) {
            if (group.contains(targetName)) {
                return group;
            }
        }

        throw new Exception("target name not found");
    }


    public static void main( String[] args ) throws Exception {

        String targetName;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter in your email: ");
        targetName = ob.nextLine();
        long assignmentNumber = 2;

        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        Collections.shuffle(names, new Random(assignmentNumber));

        grouppicker main = new grouppicker(names);

        System.out.print(main.createGroup(targetName));
    }
}

