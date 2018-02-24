package com.barrouh.TextDiffChecker.beans;

/*

 Enum for Type of Difference Removal or Addition
 
 */

public enum DiffType {

	REMOVAL("Removal"),
	ADDITION("Addition"),
	SAME("Same");
	
    private String type;

    DiffType(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }
	
	
}