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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachRCInstancesRequest extends RpcAcsRequest<AttachRCInstancesResponse> {
	   

	private String keyPair;

	private String password;

	private List<String> instanceIds;

	private String vpcId;
	public AttachRCInstancesRequest() {
		super("Rds", "2014-08-15", "AttachRCInstances", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getKeyPair() {
		return this.keyPair;
	}

	public void setKeyPair(String keyPair) {
		this.keyPair = keyPair;
		if(keyPair != null){
			putQueryParameter("KeyPair", keyPair);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			String instanceIdsArrVal = "";
			for(int depth1 = 0; depth1 < instanceIds.size(); depth1++) {
				instanceIdsArrVal += instanceIds.get(depth1) + ",";
			}
			if (instanceIdsArrVal.length() > 0) {
				instanceIdsArrVal = instanceIdsArrVal.substring(0, instanceIdsArrVal.length() - 1);
			}
			putQueryParameter("InstanceIds" , instanceIdsArrVal);
		}	
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<AttachRCInstancesResponse> getResponseClass() {
		return AttachRCInstancesResponse.class;
	}

}
