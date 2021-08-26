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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventOperationStatusRequest extends RpcAcsRequest<DescribeSecurityEventOperationStatusResponse> {
	   

	private List<String> securityEventIds;

	private Long taskId;
	public DescribeSecurityEventOperationStatusRequest() {
		super("ecd", "2020-09-30", "DescribeSecurityEventOperationStatus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityEventIds() {
		return this.securityEventIds;
	}

	public void setSecurityEventIds(List<String> securityEventIds) {
		this.securityEventIds = securityEventIds;	
		if (securityEventIds != null) {
			for (int i = 0; i < securityEventIds.size(); i++) {
				putQueryParameter("SecurityEventId." + (i + 1) , securityEventIds.get(i));
			}
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
