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
public class GetStackResourceRequest extends RpcAcsRequest<GetStackResourceResponse> {
	   

	private String clientToken;

	private String stackId;

	private List<String> resourceAttributess;

	private String logicalResourceId;

	private Boolean showResourceAttributes;
	public GetStackResourceRequest() {
		super("ROS", "2019-09-10", "GetStackResource", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
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

	public List<String> getResourceAttributess() {
		return this.resourceAttributess;
	}

	public void setResourceAttributess(List<String> resourceAttributess) {
		this.resourceAttributess = resourceAttributess;	
		if (resourceAttributess != null) {
			for (int i = 0; i < resourceAttributess.size(); i++) {
				putQueryParameter("ResourceAttributes." + (i + 1) , resourceAttributess.get(i));
			}
		}	
	}

	public String getLogicalResourceId() {
		return this.logicalResourceId;
	}

	public void setLogicalResourceId(String logicalResourceId) {
		this.logicalResourceId = logicalResourceId;
		if(logicalResourceId != null){
			putQueryParameter("LogicalResourceId", logicalResourceId);
		}
	}

	public Boolean getShowResourceAttributes() {
		return this.showResourceAttributes;
	}

	public void setShowResourceAttributes(Boolean showResourceAttributes) {
		this.showResourceAttributes = showResourceAttributes;
		if(showResourceAttributes != null){
			putQueryParameter("ShowResourceAttributes", showResourceAttributes.toString());
		}
	}

	@Override
	public Class<GetStackResourceResponse> getResponseClass() {
		return GetStackResourceResponse.class;
	}

}
