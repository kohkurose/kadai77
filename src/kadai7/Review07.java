package kadai7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;

public class Review07 {

    public static void main(String[] args) {
        EntityManager em = DBUtil.createEntityManager();

        System.out.print("personテーブルのidを入力してください->");

        int id=keyIn();


        Person person = em.find(Person.class, id);
        System.out.println("ID="+id+"の名前は"+person.getName());
        System.out.println("年齢は"+person.getAge());

        em.close();

    }

    private static int keyIn() {
        String line = null;
        int a=0;
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(
                System.in));
            line = key.readLine();
            a = Integer.parseInt(line);
        } catch (IOException e) {

        }
        return a;
    }

}
