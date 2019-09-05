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
public class DeleteApiGroupRequest extends RpcAcsRequest<DeleteApiGroupResponse> {
	
	public DeleteApiGroupRequest() {
		super("CloudAPI", "2016-07-14", "DeleteApiGroup", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String groupId;

	private String securityToken;

	private List<Tag> tags;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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
	public Class<DeleteApiGroupResponse> getResponseClass() {
		return DeleteApiGroupResponse.class;
	}

}
