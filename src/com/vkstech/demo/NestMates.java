package com.vkstech.demo;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestMates {

    public static void main(String[] args) {

        // Nest Mate
        System.out.println(A.class.isNestmateOf(A.B.class));
        System.out.println(A.B.class.isNestmateOf(A.class));
        System.out.println(A.C.class.isNestmateOf(A.C.class));
        System.out.println(A.class.isNestmateOf(A.C.D.class));
        System.out.println(A.class.isNestmateOf(E.class));

        // Nest Host
        System.out.println(A.B.class.getNestHost());
        System.out.println(A.C.D.class.getNestHost());

        // Nest Members
        Set<String> nestedMembers = Arrays.stream(A.C.D.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        nestedMembers.forEach(System.out :: println);

    }
}

class A {

    class B {

    }

    class C {

        class D {

        }
    }
}

class E {

}