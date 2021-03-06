package com.keyword;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.EnumSet;
import java.util.*;

enum Parts{EYES,NOSE,EARS,MOUTH,HANDS,LEGS}
public class EnumSetClass
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Set<Parts> set = EnumSet.of(Parts.EYES,Parts.NOSE,Parts.EARS,Parts.MOUTH,Parts.HANDS,Parts.LEGS);
        Iterator<Parts> iterate = set.iterator();
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

    }
}
