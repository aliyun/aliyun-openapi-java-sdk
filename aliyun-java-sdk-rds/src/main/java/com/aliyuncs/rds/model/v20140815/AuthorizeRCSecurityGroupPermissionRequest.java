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
public class AuthorizeRCSecurityGroupPermissionRequest extends RpcAcsRequest<AuthorizeRCSecurityGroupPermissionResponse> {
	   

	private String securityGroupId;

	@SerializedName("securityGroupPermissions")
	private List<SecurityGroupPermissions> securityGroupPermissions;

	private String direction;
	public AuthorizeRCSecurityGroupPermissionRequest() {
		super("Rds", "2014-08-15", "AuthorizeRCSecurityGroupPermission", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<SecurityGroupPermissions> getSecurityGroupPermissions() {
		return this.securityGroupPermissions;
	}

	public void setSecurityGroupPermissions(List<SecurityGroupPermissions> securityGroupPermissions) {
		this.securityGroupPermissions = securityGroupPermissions;	
		if (securityGroupPermissions != null) {
			putQueryParameter("SecurityGroupPermissions" , new Gson().toJson(securityGroupPermissions));
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

	public static class SecurityGroupPermissions {

		@SerializedName("SourcePortRange")
		private String sourcePortRange;

		@SerializedName("PortRange")
		private String portRange;

		@SerializedName("IpProtocol")
		private String ipProtocol;

		@SerializedName("SourceCidrIp")
		private String sourceCidrIp;

		@SerializedName("Priority")
		private Integer priority;

		@SerializedName("DestCidrIp")
		private String destCidrIp;

		@SerializedName("Policy")
		private String policy;

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getDestCidrIp() {
			return this.destCidrIp;
		}

		public void setDestCidrIp(String destCidrIp) {
			this.destCidrIp = destCidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	@Override
	public Class<AuthorizeRCSecurityGroupPermissionResponse> getResponseClass() {
		return AuthorizeRCSecurityGroupPermissionResponse.class;
	}

}
