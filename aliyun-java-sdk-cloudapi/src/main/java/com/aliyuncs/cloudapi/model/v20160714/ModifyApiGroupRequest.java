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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyApiGroupRequest extends RpcAcsRequest<ModifyApiGroupResponse> {
	   

	private String defaultDomain;

	private String basePath;

	private String description;

	private String securityToken;

	private String rpcPattern;

	private String userLogConfig;

	private List<Tag> tags;

	private String customerConfigs;

	private String groupId;

	private String groupName;

	private String passthroughHeaders;

	private String compatibleFlags;

	private String customTraceConfig;
	public ModifyApiGroupRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApiGroup", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultDomain() {
		return this.defaultDomain;
	}

	public void setDefaultDomain(String defaultDomain) {
		this.defaultDomain = defaultDomain;
		if(defaultDomain != null){
			putQueryParameter("DefaultDomain", defaultDomain);
		}
	}

	public String getBasePath() {
		return this.basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
		if(basePath != null){
			putQueryParameter("BasePath", basePath);
		}
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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getRpcPattern() {
		return this.rpcPattern;
	}

	public void setRpcPattern(String rpcPattern) {
		this.rpcPattern = rpcPattern;
		if(rpcPattern != null){
			putQueryParameter("RpcPattern", rpcPattern);
		}
	}

	public String getUserLogConfig() {
		return this.userLogConfig;
	}

	public void setUserLogConfig(String userLogConfig) {
		this.userLogConfig = userLogConfig;
		if(userLogConfig != null){
			putQueryParameter("UserLogConfig", userLogConfig);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getCustomerConfigs() {
		return this.customerConfigs;
	}

	public void setCustomerConfigs(String customerConfigs) {
		this.customerConfigs = customerConfigs;
		if(customerConfigs != null){
			putQueryParameter("CustomerConfigs", customerConfigs);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getPassthroughHeaders() {
		return this.passthroughHeaders;
	}

	public void setPassthroughHeaders(String passthroughHeaders) {
		this.passthroughHeaders = passthroughHeaders;
		if(passthroughHeaders != null){
			putQueryParameter("PassthroughHeaders", passthroughHeaders);
		}
	}

	public String getCompatibleFlags() {
		return this.compatibleFlags;
	}

	public void setCompatibleFlags(String compatibleFlags) {
		this.compatibleFlags = compatibleFlags;
		if(compatibleFlags != null){
			putQueryParameter("CompatibleFlags", compatibleFlags);
		}
	}

	public String getCustomTraceConfig() {
		return this.customTraceConfig;
	}

	public void setCustomTraceConfig(String customTraceConfig) {
		this.customTraceConfig = customTraceConfig;
		if(customTraceConfig != null){
			putQueryParameter("CustomTraceConfig", customTraceConfig);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ModifyApiGroupResponse> getResponseClass() {
		return ModifyApiGroupResponse.class;
	}

}
