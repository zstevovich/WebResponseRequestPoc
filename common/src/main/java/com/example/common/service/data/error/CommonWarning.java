package com.example.common.service.data.error;

public class CommonWarning extends ProblemBase {

	private static final long serialVersionUID = -7206752125571292154L;

	public CommonWarning(String warningId, String warningMessage, String warningDetails) {
        super(warningId, warningMessage, warningDetails);
    	type = "common-warning";
    }
}
