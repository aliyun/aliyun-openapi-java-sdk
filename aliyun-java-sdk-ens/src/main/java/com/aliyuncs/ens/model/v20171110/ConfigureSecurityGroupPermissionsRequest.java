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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConfigureSecurityGroupPermissionsRequest extends RpcAcsRequest<ConfigureSecurityGroupPermissionsResponse> {
	   

	private String securityGroupId;

	@SerializedName("revokePermissions")
	private List<RevokePermissions> revokePermissions;

	@SerializedName("authorizePermissions")
	private List<AuthorizePermissions> authorizePermissions;
	public ConfigureSecurityGroupPermissionsRequest() {
		super("Ens", "2017-11-10", "ConfigureSecurityGroupPermissions", "ens");
		setMethod(MethodType.POST);
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

	public List<RevokePermissions> getRevokePermissions() {
		return this.revokePermissions;
	}

	public void setRevokePermissions(List<RevokePermissions> revokePermissions) {
		this.revokePermissions = revokePermissions;	
		if (revokePermissions != null) {
			putQueryParameter("RevokePermissions" , new Gson().toJson(revokePermissions));
		}	
	}

	public List<AuthorizePermissions> getAuthorizePermissions() {
		return this.authorizePermissions;
	}

	public void setAuthorizePermissions(List<AuthorizePermissions> authorizePermissions) {
		this.authorizePermissions = authorizePermissions;	
		if (authorizePermissions != null) {
			putQueryParameter("AuthorizePermissions" , new Gson().toJson(authorizePermissions));
		}	
	}

	public static class RevokePermissions {

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

		@SerializedName("Direction")
		private String direction;

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

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class AuthorizePermissions {

		@SerializedName("SourcePortRange")
		private String sourcePortRange;

		@SerializedName("PortRange")
		private String portRange;

		@SerializedName("IpProtocol")
		private String ipProtocol;

		@SerializedName("SourceCidrIp")
		private String sourceCidrIp;

		@SerializedName("Description")
		private String description;

		@SerializedName("Priority")
		private Integer priority;

		@SerializedName("DestCidrIp")
		private String destCidrIp;

		@SerializedName("Direction")
		private String direction;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	@Override
	public Class<ConfigureSecurityGroupPermissionsResponse> getResponseClass() {
		return ConfigureSecurityGroupPermissionsResponse.class;
	}

}
