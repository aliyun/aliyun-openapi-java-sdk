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

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateEquipmentRequest extends RpcAcsRequest<OperateEquipmentResponse> {
	
	public OperateEquipmentRequest() {
		super("industry-brain", "2018-07-12", "OperateEquipment");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String operation;

	private String projectId;

	private String requestData;

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getRequestData() {
		return this.requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
		if(requestData != null){
			putBodyParameter("RequestData", requestData);
		}
	}

	@Override
	public Class<OperateEquipmentResponse> getResponseClass() {
		return OperateEquipmentResponse.class;
	}

}
