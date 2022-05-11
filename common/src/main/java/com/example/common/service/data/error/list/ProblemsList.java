package com.example.common.service.data.error.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import com.example.common.service.data.error.CommonError;
import com.example.common.service.data.error.ProblemBase;

public class ProblemsList extends ArrayList<ProblemBase> {
	
	private static final long serialVersionUID = -7423485768208908856L;
	
	protected boolean hasAnyErrors = false;
	
	
	public boolean hasAnyErrors() {
		return hasAnyErrors;
	}
	
	public boolean hasNoErrors() {
		return !hasAnyErrors;
	}

	@Override
	public boolean add(ProblemBase e) {
		if (!hasAnyErrors)
			hasAnyErrors = e instanceof CommonError;
		
		return super.add(e);
	}

	@Override
	public void add(int index, ProblemBase element) {
		if (!hasAnyErrors)
			hasAnyErrors = element instanceof CommonError;
		
		super.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends ProblemBase> c) {
		if (!hasAnyErrors)
			hasAnyErrors = findAnyErrors(c);
		
		return super.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends ProblemBase> c) {
		if (!hasAnyErrors)
			hasAnyErrors = findAnyErrors(c);
		
		return super.addAll(index, c);
	}
	
	@Override
	public ProblemBase set(int index, ProblemBase element) {
		ProblemBase problem = super.set(index, element);
		hasAnyErrors = findAnyErrors();
		return problem;
	}

	@Override
	public ProblemBase remove(int index) {
		ProblemBase problem = super.remove(index);
		hasAnyErrors = findAnyErrors();
		return problem;
	}

	@Override
	public boolean remove(Object o) {
		if (!super.remove(o))
			return false;
		
		hasAnyErrors = findAnyErrors();
		return true;
	}

	@Override
	public void clear() {
		super.clear();
		hasAnyErrors = findAnyErrors();
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		super.removeRange(fromIndex, toIndex);
		hasAnyErrors = findAnyErrors();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		if (!super.removeAll(c))
			return false;
		
		hasAnyErrors = findAnyErrors();
		return true;
	}

	@Override
	public boolean removeIf(Predicate<? super ProblemBase> filter) {
		if (!super.removeIf(filter))
			return false;
		
		hasAnyErrors = findAnyErrors();
		return true;
	}

	@Override
	public void replaceAll(UnaryOperator<ProblemBase> operator) {
		super.replaceAll(operator);
		hasAnyErrors = findAnyErrors();
	}
	
	private boolean findAnyErrors(Collection<? extends ProblemBase> c) {
		for (Iterator<?> iterator = c.iterator(); iterator.hasNext();) {
			var problem = iterator.next();
	        if (problem instanceof CommonError) {
	        	return true;
	        }
	    }
		
		return false;
	}
	
	private boolean findAnyErrors() {
		for (Iterator<?> iterator = iterator(); iterator.hasNext();) {
			var problem = iterator.next();
	        if (problem instanceof CommonError) {
	        	return true;
	        }
	    }
		
		return false;
	}
	
	public ProblemBase[] toProblemsArray() {
		ProblemBase[] problems = new ProblemBase[1];
		problems = toArray(problems);
	    return problems; 
	}
}
