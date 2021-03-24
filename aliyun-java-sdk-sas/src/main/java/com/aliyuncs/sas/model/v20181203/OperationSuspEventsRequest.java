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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperationSuspEventsRequest extends RpcAcsRequest<OperationSuspEventsResponse> {
	   

	private String suspiciousEventIds;

	private String subOperation;

	private String sourceIp;

	private String warnType;

	private String from;

	private String operation;
	public OperationSuspEventsRequest() {
		super("Sas", "2018-12-03", "OperationSuspEvents", "sas");
		setMethod(MethodType.POST);
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

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getWarnType() {
		return this.warnType;
	}

	public void setWarnType(String warnType) {
		this.warnType = warnType;
		if(warnType != null){
			putQueryParameter("WarnType", warnType);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
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
