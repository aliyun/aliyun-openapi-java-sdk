/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OperationSuspEventsRequest extends RpcAcsRequest<OperationSuspEventsResponse> {
	
	public OperationSuspEventsRequest() {
		super("aegis", "2016-11-11", "OperationSuspEvents", "vipaegis");
	}

	private String sourceIp;

	private String suspiciousEventIds;

	private String subOperation;

	private String operation;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getSuspiciousEventIds() {
		return this.suspiciousEventIds;
	}

	public void setSuspiciousEventIds(String suspiciousEventIds) {
		this.suspiciousEventIds = suspiciousEventIds;
		if(suspiciousEventIds != null){
			putQueryParameter("SuspiciousEventIds", suspiciousEventIds);
		}
	}

	public String getSubOperation() {
		return this.subOperation;
	}

	public void setSubOperation(String subOperation) {
		this.subOperation = subOperation;
		if(subOperation != null){
			putQueryParameter("SubOperation", subOperation);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<OperationSuspEventsResponse> getResponseClass() {
		return OperationSuspEventsResponse.class;
	}

}
