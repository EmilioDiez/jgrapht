package org.jgrapht.nitoku;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;


//import java.lang.reflect.Array;


public class NArrays {

    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         min(original.length, newLength));
        return copy;
    }
 
    public static boolean[] copyOf(boolean[] original, int newLength) {
    	boolean[] copy = new boolean[newLength];
        System.arraycopy(original, 0, copy, 0,
                         min(original.length, newLength));
        return copy;
    }
    
    public static boolean[] copyOf(boolean[] original) {
    	int newLength = original.length;
    	boolean[] copy = new boolean[newLength];
        System.arraycopy(original, 0, copy, 0,
                         min(original.length, newLength));
        return copy;
    }
    
    public static long[] copyOf(long[] original, int newLength) {
        long[] copy = new long[newLength];
        System.arraycopy(original, 0, copy, 0,
                         min(original.length, newLength));
        return copy;
    }
    
    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
    
    public static <T> T[] copyOf(T[] original, int newLength) {
        return (T[]) copyOf(original, newLength, (Class<T[]>) original.getClass());
    }
    
    public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
    	return copyOfRange(original, 0, newLength, newType);
    }
    
	public static <T> T[] copyOfRange(T[] original, int from, int to) {
        return copyOfRange(original, from, to, (Class<T[]>) original.getClass());
    }
    
    public static <T,U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType) {
        
    	int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        
        T[] copy = ((Object)newType == (Object)Object[].class)
            ? (T[]) new Object[newLength]
            : (T[]) newInstance(newType, newLength);
        
            //T[] copy = (T[]) new Object[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        
        return copy;
    }

	public static <T> T[] newInstance(Class<T> classe, int size) {
		
		T[] instance;
		
		//if ((Object)classe == (Object)Object[].class){
		//	instance = (T[]) new Object[size];
		//	return instance;
		//} else if ( classe == IntegerVariable.class){
		//	instance = (T[]) new IntegerVariable[size];
		//	return instance;
		//}else if ( classe == SetVariable.class){
		//	instance = (T[]) new SetVariable[size];
		//	return instance;
		//}else if ( classe == RealVariable.class){
		//	instance = (T[]) new RealVariable[size];
		//	return instance;
		//}else if ( classe == Variable.class){
		//	instance = (T[]) new Variable[size];
		//	return instance;
		//}else if ( classe == IntegerExpressionVariable.class){
		//	instance = (T[]) new IntegerExpressionVariable[size];
		//	return instance;
		//}else if ( classe == MultipleVariables.class){
		//	instance = (T[]) new MultipleVariables[size];
		//	return instance;
		//}else if ( classe == Constraint.class){
		//	instance = (T[]) new Constraint[size];
		//	return instance;
		//}else if ( classe == IntDomainVar.class){
		//	instance = (T[]) new IntDomainVar[size];
		//	return instance;
		//}else if ( classe == Var.class){
		//	instance = (T[]) new Var[size];
		//	return instance;
		//}else if ( classe == IStateLong.class){
		//	instance = (T[]) new IStateLong[size];
		//	return instance;
		//}else{
		//	//TODO: fix this, develop a proper instantiation method
		//	NLogger LOGGER = ChocoLogging.getEngineLogger(); 
		//	LOGGER.severe( " NArrays the classe.getName(): " + classe.getName() +
		//	               " needs to be included in NArrays.newInstance() ");
		//}
		      
		instance = (T[]) new Object[size];
		return instance;
	}

public static <T>T newInstance(Class<T> classe ) {
		
		T instance;
				
		if (classe == DefaultEdge.class){
			instance = (T) new DefaultEdge();
			return instance;
		} else if ( classe == String.class){
			instance = (T) new String();
			return instance;
		}else if ( classe == DefaultWeightedEdge.class){
			instance = (T) new DefaultWeightedEdge();
			return instance;
		}else if ( classe == Object.class){
			instance = (T) new Object();
			return instance;
		//}else if ( classe == FooEdge.class){
		//	instance = (T) new FooEdge();
		//	return instance;
		//}else if ( classe == CustomEdge.class){
		//	instance = (T) new CustomEdge();
		//	return instance;
		//}else if ( classe == BarEdge.class){
		//	instance = (T) new BarEdge();
		//	return instance;
		//}else if ( classe == Constraint.class){
		//	instance = (T[]) new Constraint[size];
		//	return instance;
		//}else if ( classe == IntDomainVar.class){
		//	instance = (T[]) new IntDomainVar[size];
		//	return instance;
		//}else if ( classe == Var.class){
		//	instance = (T[]) new Var[size];
		//	return instance;
		//}else if ( classe == IStateLong.class){
		//	instance = (T[]) new IStateLong[size];
		//	return instance;
		}else{
			//TODO: fix this, develop a proper instantiation method
			System.out.println(" NArrays the classe.getName(): " + classe.getName() +
				               " needs to be included in NArrays.newInstance() ");
		}
		
		return (T) new Object();
	}

	public static double[] copyOf(double[] original, int newLength) {
		double[] copy = new double[newLength];
        System.arraycopy(original, 0, copy, 0,
                         min(original.length, newLength));
        return copy;
	}
    
}
