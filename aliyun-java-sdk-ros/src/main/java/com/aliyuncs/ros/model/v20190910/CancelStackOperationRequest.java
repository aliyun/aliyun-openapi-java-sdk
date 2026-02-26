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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CancelStackOperationRequest extends RpcAcsRequest<CancelStackOperationResponse> {
	   

	private String stackId;

	private String cancelType;

	private List<String> allowedStackOperationss;
	public CancelStackOperationRequest() {
		super("ROS", "2019-09-10", "CancelStackOperation", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public String getCancelType() {
		return this.cancelType;
	}

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
		if(cancelType != null){
			putQueryParameter("CancelType", cancelType);
		}
	}

	public List<String> getAllowedStackOperationss() {
		return this.allowedStackOperationss;
	}

	public void setAllowedStackOperationss(List<String> allowedStackOperationss) {
		this.allowedStackOperationss = allowedStackOperationss;	
		if (allowedStackOperationss != null) {
			for (int i = 0; i < allowedStackOperationss.size(); i++) {
				putQueryParameter("AllowedStackOperations." + (i + 1) , allowedStackOperationss.get(i));
			}
		}	
	}

	@Override
	public Class<CancelStackOperationResponse> getResponseClass() {
		return CancelStackOperationResponse.class;
	}

}
