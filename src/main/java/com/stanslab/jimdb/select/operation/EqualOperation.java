package com.stanslab.jimdb.select.operation;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.stanslab.jimdb.ds.JimdbTreeMap;
import com.stanslab.jimdb.select.Operation;
import com.stanslab.jimdb.select.OperationParam;

public class EqualOperation implements Operation {
	
	private OperationParam operationParam;
	
	public EqualOperation(OperationParam operationParam) {
		this.operationParam = operationParam;
	}
	
	
	public List<Integer> eval(String column, Object value) {
		Map<String, JimdbTreeMap<Object, List<Integer>>> dataMapping = operationParam.getDataMapping();
		
		return dataMapping.get(column).get(value);
	}
	
	public List<Integer> eval(List<Integer> list1, List<Integer> list2) {
		
		
		return null;
	}

}
