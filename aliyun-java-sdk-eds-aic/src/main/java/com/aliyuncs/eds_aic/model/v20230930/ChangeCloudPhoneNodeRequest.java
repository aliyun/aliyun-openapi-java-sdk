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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeCloudPhoneNodeRequest extends RpcAcsRequest<ChangeCloudPhoneNodeResponse> {
	   

	private String instanceType;

	private String nodeId;

	private Integer phoneCount;
	public ChangeCloudPhoneNodeRequest() {
		super("eds-aic", "2023-09-30", "ChangeCloudPhoneNode");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	public Integer getPhoneCount() {
		return this.phoneCount;
	}

	public void setPhoneCount(Integer phoneCount) {
		this.phoneCount = phoneCount;
		if(phoneCount != null){
			putQueryParameter("PhoneCount", phoneCount.toString());
		}
	}

	@Override
	public Class<ChangeCloudPhoneNodeResponse> getResponseClass() {
		return ChangeCloudPhoneNodeResponse.class;
	}

}
