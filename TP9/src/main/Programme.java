package main;

import ensemble.Ensemble;

import java.util.*;

public class Programme
{
    public static void main(String[] args)
    {
        /*
        HashSet<Integer> hs = new HashSet<Integer>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        TreeSet<Integer> ts = new TreeSet<Integer>();

        int[] ge = new int[]{12, 78, 5, 42, 18, 5};

        for (int i = 0; i < 5; i++)
        {
            Integer nb = ge[i];
            hs.add(nb);
            lhs.add(nb);
            ts.add(nb);
            //e.add(nb);
        }

        for(Integer i : hs)
        {
            System.out.println("hs => " + i.toString());
        }

        for(Integer i : lhs)
        {
            System.out.println("lhs => " + i.toString());
        }

        for(Integer i : ts)
        {
            System.out.println("ts => " + i.toString());
        }

        Ensemble<Integer> e = new Ensemble<Integer>(lhs);
        Ensemble<Integer> r = e.intersection(Arrays.asList(5, 18, 42, 56, 49));
        for(Integer i : r)
        {
            System.out.println("e => " + i.toString());
        }*/

        // Ex 3
        ArrayList<Long> moy = new ArrayList<Long>();

        Set<Integer> s = new HashSet<Integer>(Arrays.asList(12, 78, 5, 42, 18, 99, 45, 756, 15497, 45946 ,15, 1, 53, 145, 45998));

        for (int i = 0; i < 100; i++)
        {
            long startTime = System.nanoTime();
            for(Iterator<Integer> it = s.iterator() ; it.hasNext();)
            {
                Integer d = it.next();
                if(d.equals(new Integer(12)))
                {
                    break;
                }
            }
            long endTime = System.nanoTime();

            moy.add(endTime - startTime);
        }

        System.out.println(moyenne(moy));

        // ---

        moy.clear();
        List<Integer> q = new ArrayList<Integer>(Arrays.asList(12, 78, 5, 42, 18, 99, 45, 756, 15497, 45946 ,15, 1, 53, 145, 45998));


        for (int i = 0; i < 100; i++)
        {
            long startTime = System.nanoTime();
            for(Iterator<Integer> it = q.iterator() ; it.hasNext();)
            {
                Integer d = it.next();
                if(d.equals(new Integer(12)))
                {
                    break;
                }
            }
            long endTime = System.nanoTime();

            moy.add(endTime - startTime);
        }

        System.out.println(moyenne(moy));


    }

    public static long moyenne(List<Long> l)
    {
        long ret = 0;
        for(Long ll : l)
        {
            ret += ll;
        }
        return ret/l.size();
    }
}
