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

package com.aliyuncs.ccs.model.v20171001;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ProceedTicketRequest extends RpcAcsRequest<ProceedTicketResponse> {
	
	public ProceedTicketRequest() {
		super("Ccs", "2017-10-01", "ProceedTicket", "ccs");
	}

	private String memo;

	private String id;

	private String ccsInstanceId;

	private String operation;

	private String operatorId;

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putQueryParameter("Memo", memo);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}

	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
		if(ccsInstanceId != null){
			putQueryParameter("CcsInstanceId", ccsInstanceId);
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

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putQueryParameter("OperatorId", operatorId);
		}
	}

	@Override
	public Class<ProceedTicketResponse> getResponseClass() {
		return ProceedTicketResponse.class;
	}

}
