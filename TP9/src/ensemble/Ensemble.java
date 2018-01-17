package ensemble;

import java.util.Collection;
import java.util.HashSet;
public class Ensemble<E> extends HashSet<E>
{
    public Ensemble(Collection<E> c)
    {
        super(c);
    }

    public Ensemble<E> union(Collection<E> c)
    {
        Ensemble<E> ret = new Ensemble<E>(this);
        ret.addAll(c);
        return ret;
    }

    public Ensemble<E> intersection(Collection<E> c)
    {
        Ensemble<E> ret = new Ensemble<E>(this);
        ret.retainAll(c);
        return ret;
    }

    public Ensemble<E> difference(Collection<E> c)
    {
        Ensemble<E> ret = new Ensemble<E>(this);
        ret.removeAll(c);
        return ret;
    }
}