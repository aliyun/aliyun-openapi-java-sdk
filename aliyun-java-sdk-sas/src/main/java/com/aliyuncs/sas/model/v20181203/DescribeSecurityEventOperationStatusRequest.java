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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventOperationStatusRequest extends RpcAcsRequest<DescribeSecurityEventOperationStatusResponse> {
	   

	private Long resourceOwnerId;

	private List<String> securityEventIdss;

	private String sourceIp;

	private Long taskId;
	public DescribeSecurityEventOperationStatusRequest() {
		super("Sas", "2018-12-03", "DescribeSecurityEventOperationStatus", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getSecurityEventIdss() {
		return this.securityEventIdss;
	}

	public void setSecurityEventIdss(List<String> securityEventIdss) {
		this.securityEventIdss = securityEventIdss;	
		if (securityEventIdss != null) {
			for (int i = 0; i < securityEventIdss.size(); i++) {
				putQueryParameter("SecurityEventIds." + (i + 1) , securityEventIdss.get(i));
			}
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<DescribeSecurityEventOperationStatusResponse> getResponseClass() {
		return DescribeSecurityEventOperationStatusResponse.class;
	}

}
