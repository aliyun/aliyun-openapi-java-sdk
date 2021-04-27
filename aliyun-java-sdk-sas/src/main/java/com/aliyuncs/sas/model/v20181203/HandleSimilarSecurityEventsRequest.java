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
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class HandleSimilarSecurityEventsRequest extends RpcAcsRequest<HandleSimilarSecurityEventsResponse> {
	   

	private String markMissParam;

	private Long resourceOwnerId;

	private String sourceIp;

	private String operationCode;

	private Long taskId;

	private String operationParams;
	public HandleSimilarSecurityEventsRequest() {
		super("Sas", "2018-12-03", "HandleSimilarSecurityEvents", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMarkMissParam() {
		return this.markMissParam;
	}

	public void setMarkMissParam(String markMissParam) {
		this.markMissParam = markMissParam;
		if(markMissParam != null){
			putQueryParameter("MarkMissParam", markMissParam);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getOperationCode() {
		return this.operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
		if(operationCode != null){
			putQueryParameter("OperationCode", operationCode);
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getOperationParams() {
		return this.operationParams;
	}

	public void setOperationParams(String operationParams) {
		this.operationParams = operationParams;
		if(operationParams != null){
			putQueryParameter("OperationParams", operationParams);
		}
	}

	@Override
	public Class<HandleSimilarSecurityEventsResponse> getResponseClass() {
		return HandleSimilarSecurityEventsResponse.class;
	}

}
