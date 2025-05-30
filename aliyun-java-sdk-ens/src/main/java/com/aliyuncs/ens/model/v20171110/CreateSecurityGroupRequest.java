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
public class CreateSecurityGroupRequest extends RpcAcsRequest<CreateSecurityGroupResponse> {
	   

	private String description;

	private String securityGroupName;

	@SerializedName("permissions")
	private List<Permissions> permissions;
	public CreateSecurityGroupRequest() {
		super("Ens", "2017-11-10", "CreateSecurityGroup", "ens");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public List<Permissions> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permissions> permissions) {
		this.permissions = permissions;	
		if (permissions != null) {
			putQueryParameter("Permissions" , new Gson().toJson(permissions));
		}	
	}

	public static class Permissions {

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
	public Class<CreateSecurityGroupResponse> getResponseClass() {
		return CreateSecurityGroupResponse.class;
	}

}
