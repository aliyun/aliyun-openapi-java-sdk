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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RevokeRCSecurityGroupPermissionRequest extends RpcAcsRequest<RevokeRCSecurityGroupPermissionResponse> {
	   

	@SerializedName("securityGroupRuleIdList")
	private List<String> securityGroupRuleIdList;

	private String securityGroupId;

	private String direction;
	public RevokeRCSecurityGroupPermissionRequest() {
		super("Rds", "2014-08-15", "RevokeRCSecurityGroupPermission", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityGroupRuleIdList() {
		return this.securityGroupRuleIdList;
	}

	public void setSecurityGroupRuleIdList(List<String> securityGroupRuleIdList) {
		this.securityGroupRuleIdList = securityGroupRuleIdList;	
		if (securityGroupRuleIdList != null) {
			putQueryParameter("SecurityGroupRuleIdList" , new Gson().toJson(securityGroupRuleIdList));
		}	
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<RevokeRCSecurityGroupPermissionResponse> getResponseClass() {
		return RevokeRCSecurityGroupPermissionResponse.class;
	}

}
