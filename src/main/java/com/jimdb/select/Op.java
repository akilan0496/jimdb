package com.jimdb.select;

public enum Op {

	EQ, NEQ, LT, LTE, GT, GTE, // relational operators

	AND, OR, NOT, // logical operators

	START_WITH, END_WITH, CONTAINS, EMPTY // other operators
}